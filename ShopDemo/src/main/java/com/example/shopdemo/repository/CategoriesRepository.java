package com.example.shopdemo.repository;

import com.example.shopdemo.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Long> {
    Categories findByName(String name);
}
