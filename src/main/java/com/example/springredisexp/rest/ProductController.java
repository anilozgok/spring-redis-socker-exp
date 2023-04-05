package com.example.springredisexp.rest;

import com.example.springredisexp.repository.ProductRepository;
import com.example.springredisexp.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product/")
public class ProductController {
    private final ProductRepository productRepository;

    @PostMapping("/save/")
    public Product save(@RequestBody Product product) {

        return productRepository.save(product);
    }

    @GetMapping("/all/")
    public List<Product> getAll() {

        return productRepository.findAll();
    }

    @GetMapping("/{id}/")
    public Product getById(@PathVariable(name = "id") int id) {

        return productRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}/")
    public void delete(@PathVariable(name = "id") int id) {

        productRepository.delete(id);
    }

}
