package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface CarRepo extends JpaRepository<CarEntity, Integer> {
	List<CarEntity> findByModel(String model);
	@Query (value="select m from CarEntity m where m.price=:x")
	public List<CarEntity> getPrice(@Param ("x") int x);
//	@Query(value="select max(price) from car",nativeQuery=true)
//	public List<CarEntity> getMaxPrice();
	
//	@Query(value="select * from car where brand like=?",nativeQuery=true)
//		public List<CarEntity> getBrand();


	

}
