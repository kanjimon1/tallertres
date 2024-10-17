package com.grupo3.proyecto_demo.service;

import com.grupo3.proyecto_demo.model.Producto;
import com.grupo3.proyecto_demo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }
    public Producto agregarProducto(Producto producto) {
        return productoRepository.save(producto);
    }
    public Optional<Producto> obtenerProductoPorId(Long id) {
        return productoRepository.findById(id);
    }
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}
