package com.example.demo;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CarController {
	@Autowired
	CarService carser;
	@Autowired
	CarRepo  cr;
	@GetMapping("/findModel/{a}")
	public List<CarEntity> findModel(@PathVariable String a){
		return cr.findByModel(a);
	}
	
//static Logger log=Logger.getLogger(CarController.class);
	
//	@PostMapping(value="/post")
//	public String postValue(@RequestBody CarEntity a) {
//		PropertyConfigurator.configure("log4j.properties");
//		log.info(cs.postValue(a));
//		return cs.postValue(a);
//	}
	
	@PostMapping(value="/post")
	public String post(@RequestBody CarEntity a) {
		return carser.post(a);
	}
	
	@PostMapping(value="postt")
	public String  postt(@RequestBody CarEntity a) throws PricenotFoundException {
		return carser.postt(a);
	}
	
	@PostMapping(value="/postAll")
	public String postAll(@RequestBody  List<CarEntity> a) {
		return carser.postAll(a);
	}
	@GetMapping("getAll")
	public List<CarEntity> getAll(){
		return carser.getAll();
		
		
	}
	@GetMapping("/getById")
		public CarEntity getById(@PathVariable int id) {
			return carser.getById(id);
		}
	
	
//	@GetMapping(value="/getByMaxPrice")
//	public List<CarEntity> getByMaxPrice() {
//		return cs.getByMaxPrice();
//	}
	@GetMapping(value="/getPrice/{x}")
	public List<CarEntity> getByMaxPrice(@PathVariable int x) {
		return carser.getPrice(x);
	}
	@PutMapping(value="/update")
	public String update(@RequestBody CarEntity s) {
		return carser.update(s);
	}
	@PatchMapping("/patch/{id}/{brand}")
	public String patch(@PathVariable String brand,@PathVariable int id ) {
		return carser.patch(brand,id);
	}
	
	
	
	@GetMapping(value="/getBrand/{br}")
	public List<CarEntity> getBrand(@PathVariable String br) throws BrandNotException{
		return carser.getBrand(br);
	}
	
	
	@GetMapping(value="/getBrands")
	public List<Car> getCbrand() {
		return carser.getCbrand();
	}
}


