package com.apirest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.modelo.Producto;
import com.apirest.modelo.ProductoRepositorio;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoRepositorio productoRepositorio;

    /**
     * Obtenemos todos los productos
     *
     * @return
     */
    @GetMapping("/producto")
    public List<Producto> obtenerTodos() {
        return productoRepositorio.findAll();
    }

    /**
     * Obtenemos un producto en base a su ID
     *
     * @param id
     * @return Null si no encuentra el producto
     */
    @GetMapping("/producto/{id}")
    public Producto obtenerUno(@PathVariable Long id) {
        return productoRepositorio.findById(id).orElse(null);
    }

    /**
     * Insertamos un nuevo producto
     *
     * @param nuevo
     * @return producto insertado
     */
    @PostMapping("/producto")
    public Producto nuevoProducto(@RequestBody Producto nuevo) {
        return productoRepositorio.save(nuevo);
    }
}