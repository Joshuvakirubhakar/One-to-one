package com.example.Onetoone_Bidirectionalmapping.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Onetoone_Bidirectionalmapping.DTO.LapRequestDTO;
import com.example.Onetoone_Bidirectionalmapping.DTO.LapResponse;
import com.example.Onetoone_Bidirectionalmapping.Entities.Laptop;
import com.example.Onetoone_Bidirectionalmapping.Repository.LapRepo;
import com.example.Onetoone_Bidirectionalmapping.Service.LaptopServices;

@Service
public class LaptopServiceImpl implements LaptopServices {

	@Autowired
	private LapRepo lapRepo;

	@Override
	public List<LapResponse> getAllLaptops() {
		List<Laptop> laptops = lapRepo.findAll();
		List<LapResponse> lapResponses = new ArrayList<LapResponse>();
		for (Laptop laptop : laptops) {
			LapResponse lapResponse = new LapResponse();
			lapResponse.setId(laptop.getId());
//			lapResponse.setLaptop(laptop.getName());
			lapResponse.setLaptop(laptop.getBrand().getLaptop().getName());
			lapResponse.setBrand(laptop.getBrand().getName());
			lapResponses.add(lapResponse);
		}
		return lapResponses;
	}

	@Override
	public String saveLaptops(LapRequestDTO dto) {
		Laptop laptop = new Laptop();
		laptop.setName(dto.getName());
		laptop.setBrand(dto.getBrand());
		lapRepo.save(laptop);
//		return laptop.toString()+" is saved successfully !!! ";
		return "LaptopID: "+laptop.getId().toString()+" is saved successfully !!! ";
	}

	@Override
	public LapResponse getLaptopById(Long id) {
		Optional<Laptop> laptop = lapRepo.findById(id);
		LapResponse lapResponse = new LapResponse();
		lapResponse.setId(laptop.get().getId());
		lapResponse.setLaptop(laptop.get().getName());
		lapResponse.setBrand(laptop.get().getBrand().getName());
		return lapResponse;
	}

	@Override
	public String deleteById(Long id) {
		// TODO Auto-generated method stub
		Optional<Laptop> laptop = lapRepo.findById(id);
		lapRepo.delete(laptop.get());
		return "Name: "+laptop.get().getName() +" with id: "+id+" was deleted";
	}


}
