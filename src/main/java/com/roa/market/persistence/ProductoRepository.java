package com.roa.market.persistence;

import com.roa.market.persistence.crud.ProductoCrudRespository;
import com.roa.market.persistence.entity.Producto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    private ProductoCrudRespository productoCrudRespository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRespository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRespository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRespository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRespository.findById(idProducto);
    }

    public Producto save(Producto producto){
        return productoCrudRespository.save(producto);
    }

    public void delete(int idProducto){
        productoCrudRespository.deleteById(idProducto);
    }
}
