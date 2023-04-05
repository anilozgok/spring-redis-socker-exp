package com.example.springredisexp.repository;

import com.example.springredisexp.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepository {

    public static final String HASH_KEY = "product";

    private final RedisTemplate redisTemplate;

    public Product save(Product product) {

        redisTemplate.opsForHash().put(HASH_KEY, product.getId(), product);
        return product;
    }

    public List<Product> findAll() {

        return redisTemplate.opsForHash().values(HASH_KEY);
    }

    public Product findById(int id) {

        return (Product) redisTemplate.opsForHash().get(HASH_KEY, id);
    }

    public void delete(int id) {

        redisTemplate.opsForHash().delete(HASH_KEY, id);
    }

}
