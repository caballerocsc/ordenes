package io.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.model.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Integer>{

}
