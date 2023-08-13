package com.example.Onetoone_Bidirectionalmapping.DTO;

import com.example.Onetoone_Bidirectionalmapping.Entities.Brands;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LapRequestDTO {

	private String name;
	private Brands brand;
}
