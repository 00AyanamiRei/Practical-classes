package com.ayanami.practice4.repo;

import com.ayanami.practice4.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}