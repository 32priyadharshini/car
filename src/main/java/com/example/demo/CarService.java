package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarService {
	@Autowired
	CarDao cd;
	@Autowired
	CarRepo cr;
	static Logger log=Logger.getLogger(CarApplication.class);
	public String post(CarEntity a) {
		return cd.post(a);
	}
	
	public String postAll(List<CarEntity> a) {
		return cd.postAll(a);
	}

	public List<CarEntity> getAll() {
		// TODO Auto-generated method stub
		return cd.getAll();
	}

//	public List<CarEntity> getByMaxPrice() {
//		// TODO Auto-generated method stub
//		return cd.getByMaxPrice();
//	}
	public List<CarEntity> getPrice(int x) {
		// TODO Auto-generated method stub
		return cd.getPrice(x);
	}

	public String update(CarEntity s) {
		// TODO Auto-generated method stub
		return cd.update(s);
	}

	public String patch(String brand, int id) {
		// TODO Auto-generated method stub
		return cd.patch(brand,id);
	}

	public CarEntity getById(int id) {
		// TODO Auto-generated method stub
		return cd.getById(id);
	}

	public String postt(CarEntity a) throws PricenotFoundException {
		if(a.getPrice()>100000) {
			return cd.postt(a);
		}else {
		throw new PricenotFoundException("Exception");
	}
	}

	public List<CarEntity> getBrand(String br) throws BrandNotException {
		PropertyConfigurator.configure("log4j.properties");
		List<CarEntity> a=cd.getAll();
		List<CarEntity> b=a.stream().filter(k->k.getBrand().equals(br)).toList();
		if(b.isEmpty()) {
			throw new BrandNotException("brand");
    	}
    	else {
    		log.info(b);
    		return b;
    		
	}
	}

	public String postValue(CarEntity a) {

		
		return cd.postValue(a);
	}

	public List<Car> getCbrand() {
		// TODO Auto-generated method stub
		List<CarEntity> a=cr.findAll();
		return a.stream().filter(u->u.getBrand().equalsIgnoreCase("bjjjjr")).map(value->new Car(value.getAmount(),value.getBrand())).collect(Collectors.toList());
	}

}
