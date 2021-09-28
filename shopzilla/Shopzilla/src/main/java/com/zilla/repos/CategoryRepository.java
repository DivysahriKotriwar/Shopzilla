package com.zilla.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zilla.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
