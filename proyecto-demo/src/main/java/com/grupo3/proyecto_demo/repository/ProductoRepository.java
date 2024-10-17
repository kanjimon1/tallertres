package com.grupo3.proyecto_demo.repository;

import com.grupo3.proyecto_demo.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
