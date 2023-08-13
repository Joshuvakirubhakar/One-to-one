package com.example.Onetoone_Bidirectionalmapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Onetoone_Bidirectionalmapping.Entities.Laptop;

@Repository
public interface LapRepo extends JpaRepository<Laptop, Long>{

}
