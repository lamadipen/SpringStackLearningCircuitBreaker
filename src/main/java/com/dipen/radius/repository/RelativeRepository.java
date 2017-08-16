package com.dipen.radius.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dipen.radius.domain.Relative;

@Repository
public interface RelativeRepository extends CrudRepository<Relative,Long>{
	
	List<Relative> findByName(String name);
}
