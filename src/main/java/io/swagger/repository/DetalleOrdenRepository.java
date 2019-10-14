package io.swagger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.DetalleOrden;


public interface DetalleOrdenRepository  extends JpaRepository<DetalleOrden, Integer>{

	@Query(value="select det.iddetorden, det.idorden, p.nombre as idproducto, det.cantidad, det.valorunidad, pro.nombre as idproveedor, det.estado\r\n" + 
			"from detorden det inner join producto p on\r\n" + 
			"p.idproducto = det.idproducto inner join proveedor pro on\r\n" + 
			"pro.idproveedor = det.idproveedor where det.idorden = ?1", nativeQuery = true)
    public List<DetalleOrden> findByIdOrden(Integer idorden);
	
	@Query(value = "select * from detorden where idproducto = ?1", nativeQuery = true)
	public List<DetalleOrden> findByIdProducto(Integer idproducto);
}
