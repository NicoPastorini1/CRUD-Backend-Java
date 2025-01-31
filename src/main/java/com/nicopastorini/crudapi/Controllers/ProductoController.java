package com.nicopastorini.crudapi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.nicopastorini.crudapi.Entities.Producto;
import com.nicopastorini.crudapi.Repositories.ProductoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("api/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository ProductoRepository;

    @GetMapping
    public List<Producto> getAllProducto(){
        return ProductoRepository.findAll();
    }


    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable Integer id){
        return ProductoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("No se encontró el producto: " + id));
    }
    

    @PostMapping
    public Producto createProducto(@RequestBody Producto producto){
        return ProductoRepository.save(producto);
    }

    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable Integer id, @RequestBody Producto detalleProducto) {
        Producto producto = ProductoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontro el producto: " + id));

        producto.setNombre(detalleProducto.getNombre());
        producto.setPrecio(detalleProducto.getPrecio());

        return ProductoRepository.save(producto);

    }

    @DeleteMapping("/{id}")
    public String deleteProducto(@PathVariable Integer id){
        Producto producto = ProductoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontro el producto: " + id)); 

        ProductoRepository.delete(producto);
        return "El producto " + producto.getNombre() + " fue eliminado correctamente";
    }
}

