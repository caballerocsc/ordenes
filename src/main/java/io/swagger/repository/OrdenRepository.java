package io.swagger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Integer>{

	@Query(value = "select o.idorden, c.nombre+' '+ c.apellido as idcliente, d.direccion as iddireccion, o.valortotal, o.cantidadproductos, o.fechasolicitud, o.fechaaprobacion, o.fechacierre, o.estado, o.comentario, o.origen\r\n" + 
			"FROM ordenes o\r\n" + 
			"inner join cliente c on\r\n" + 
			"o.idcliente = c.idcliente\r\n" + 
			"inner join direccion d on\r\n" + 
			"d.iddireccion = o.iddireccion\r\n" + 
			"WHERE c.nombre like ?1 ", nativeQuery = true)
	public List<Orden> findByIdCliente(String cliente);
	
	@Query(value ="select o.idorden, c.nombre+' '+ c.apellido as idcliente, d.direccion as iddireccion, o.valortotal, o.cantidadproductos, o.fechasolicitud, o.fechaaprobacion, o.fechacierre, o.estado, o.comentario, o.origen\r\n" + 
			"FROM ordenes o\r\n" + 
			"inner join cliente c on\r\n" + 
			"o.idcliente = c.idcliente\r\n" + 
			"inner join direccion d on\r\n" + 
			"d.iddireccion = o.iddireccion\r\n" + 
			"select * FROM ordenes WHERE estado = ?1 ", nativeQuery = true)
	public List<Orden> findByIdEstado(int idEstado);
	
	@Query(value = "select o.idorden, c.nombre+' '+ c.apellido as idcliente, d.direccion as iddireccion, o.valortotal, o.cantidadproductos, o.fechasolicitud, o.fechaaprobacion, o.fechacierre, o.estado, o.comentario, o.origen\r\n" + 
			"FROM ordenes o\r\n" + 
			"inner join cliente c on\r\n" + 
			"o.idcliente = c.idcliente\r\n" + 
			"inner join direccion d on\r\n" + 
			"d.iddireccion = o.iddireccion\r\n" + 
			"where idorden = ?1", nativeQuery = true)
	public Orden findByIdOrden(Integer idOrden);
	
}
