package io.swagger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import io.swagger.model.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Integer>{

	@Query(value = "select o.idorden, c.nombre||' '||c.apellido as idcliente, d.direccion as iddireccion, o.valortotal, o.cantidadproductos, o.fechasolicitud, o.fechaaprobacion, o.fechacierre, o.estado, o.comentario, o.origen\r\n" + 
			"FROM ordenes o\r\n" + 
			"inner join cliente c on\r\n" + 
			"o.idcliente = c.idcliente\r\n" + 
			"inner join direccion d on\r\n" + 
			"d.iddireccion = o.iddireccion\r\n" + 
			"WHERE c.nombre like %?1% or c.apellido like %?2%", nativeQuery = true)
	public List<Orden> findByIdCliente(String nombre, String apellido);
	
	@Query(value ="select o.idorden, c.nombre||' '||c.apellido as idcliente, d.direccion as iddireccion, o.valortotal, o.cantidadproductos, o.fechasolicitud, o.fechaaprobacion, o.fechacierre, o.estado, o.comentario, o.origen\r\n" + 
			"FROM ordenes o\r\n" + 
			"inner join cliente c on\r\n" + 
			"o.idcliente = c.idcliente\r\n" + 
			"inner join direccion d on\r\n" + 
			"d.iddireccion = o.iddireccion\r\n" + 
			"WHERE o.estado = ?1 ", nativeQuery = true)
	public List<Orden> findByIdEstado(int idEstado);
	
	@Query(value = "select o.idorden, c.nombre||' '||c.apellido as idcliente, d.direccion as iddireccion, o.valortotal, o.cantidadproductos, o.fechasolicitud, o.fechaaprobacion, o.fechacierre, o.estado, o.comentario, o.origen \r\n" + 
			"FROM ordenes o \r\n" + 
			"inner join cliente c on \r\n" + 
			"o.idcliente = c.idcliente \r\n" + 
			"inner join direccion d on \r\n" + 
			"d.iddireccion = o.iddireccion \r\n" + 
			"where idorden = ?1", nativeQuery = true)
	public Orden findByIdOrden(Integer idOrden);
	
	@Query(value= "select o.idorden, c.nombre||' '||c.apellido as idcliente, d.direccion as iddireccion, o.valortotal, o.cantidadproductos, o.fechasolicitud, o.fechaaprobacion, o.fechacierre, o.estado, o.comentario, o.origen\r\n" + 
			"from ordenes o inner join detorden do on o.idorden = do.iddetorden inner join cliente c on\r\n" + 
			"o.idcliente = c.idcliente inner join direccion d on d.iddireccion = o.iddireccion inner join producto p on\r\n" + 
			"p.idproducto = do.idproducto where upper(p.nombre) like %?1%", nativeQuery=true)
	public List<Orden> findByProducto(String name);
	
    @Transactional
	@Modifying
	@Query(value="update ordenes set estado = ?1 where idorden = ?2", nativeQuery = true)
	public void actualizaEstado(int idEstado, int idOrden);
	
}
