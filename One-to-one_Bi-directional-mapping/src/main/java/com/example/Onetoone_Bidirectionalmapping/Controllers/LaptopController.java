package com.example.Onetoone_Bidirectionalmapping.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Onetoone_Bidirectionalmapping.DTO.LapRequestDTO;
import com.example.Onetoone_Bidirectionalmapping.DTO.LapResponse;
import com.example.Onetoone_Bidirectionalmapping.Service.LaptopServices;

@RestController
public class LaptopController {

	@Autowired
	private LaptopServices laptopServices;
	
	@GetMapping
	public ResponseEntity<List<LapResponse>> getAllLaptops(){
		return new ResponseEntity<>(laptopServices.getAllLaptops(),HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
	public LapResponse getLaptopById(@PathVariable Long id){
		return laptopServices.getLaptopById(id);
		
	}
	
	@PostMapping
	public ResponseEntity<String> getAllLaptops(@RequestBody LapRequestDTO dto){
		
		return new ResponseEntity<>(laptopServices.saveLaptops(dto),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable Long id){
		return laptopServices.deleteById(id);
		
	}
}
