package com.example.shopdemo.repository;

import com.example.shopdemo.entities.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends JpaRepository<Size, Long> {
    Size findByName(String name);
}
