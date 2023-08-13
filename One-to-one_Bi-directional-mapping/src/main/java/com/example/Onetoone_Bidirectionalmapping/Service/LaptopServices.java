package com.example.Onetoone_Bidirectionalmapping.Service;

import java.util.List;

import com.example.Onetoone_Bidirectionalmapping.DTO.LapRequestDTO;
import com.example.Onetoone_Bidirectionalmapping.DTO.LapResponse;

public interface LaptopServices {

	public List<LapResponse> getAllLaptops();

	public String saveLaptops(LapRequestDTO dto);

	public LapResponse getLaptopById(Long id);

	public String deleteById(Long id);
}
