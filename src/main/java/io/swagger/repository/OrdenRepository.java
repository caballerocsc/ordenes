package io.swagger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Integer>{

	@Query(value = "select * FROM ordenes WHERE idcliente = ?1 ", nativeQuery = true)
	public List<Orden> findByIdCliente(Integer idcliente);
	
	@Query(value = "select * FROM ordenes WHERE estado = 1 ", nativeQuery = true)
	public List<Orden> findByIdActivas();
	
}
