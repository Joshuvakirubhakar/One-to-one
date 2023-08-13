package com.example.Onetoone_Bidirectionalmapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Onetoone_Bidirectionalmapping.Entities.Brands;

@Repository
public interface BrandRepo extends JpaRepository<Brands, Long> {

}
