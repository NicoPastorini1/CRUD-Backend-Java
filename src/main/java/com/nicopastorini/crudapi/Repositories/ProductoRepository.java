package com.nicopastorini.crudapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nicopastorini.crudapi.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {


}
