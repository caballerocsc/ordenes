package io.swagger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.DetalleOrden;


public interface DetalleOrdenRepository  extends JpaRepository<DetalleOrden, Integer>{

	@Query(value="select * from detorden where idorden = ?1", nativeQuery = true)
    public List<DetalleOrden> findByIdOrden(Integer idorden);
	
	@Query(value = "select * from detorden where idproducto = ?1", nativeQuery = true)
	public List<DetalleOrden> findByIdProducto(Integer idproducto);
}
