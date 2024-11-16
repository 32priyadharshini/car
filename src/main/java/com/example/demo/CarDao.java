package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarDao {
	@Autowired
	CarRepo cr;
	public String post(CarEntity a) {
		cr.save(a);
		return "Saved";
	}
	
	public String postAll(List<CarEntity> a) {
		cr.saveAll(a);
		return "Saved All";
	}

	public List<CarEntity> getAll() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

//	public List<CarEntity> getByMaxPrice() {
//		// TODO Auto-generated method stub
//		return cr.getMaxPrice();
//	}
	
	public List<CarEntity> getPrice(int x) {
		// TODO Auto-generated method stub
		return cr.getPrice(x);
	}

	public String update(CarEntity s) {
		cr.save(s);
		// TODO Auto-generated method stub
		return "Data update";
	}

	public String patch(String brand, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public CarEntity getById(int id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

	public String postt(CarEntity a) {
		cr.save(a);
		return "saved";
	}

	public String postValue(CarEntity a) {
		cr.save(a);
		return "saved";
	}

//	public List<CarEntity> getBrand(String br) {
//		// TODO Auto-generated method stub
//		return getBrand(br);
//	}
	

}
