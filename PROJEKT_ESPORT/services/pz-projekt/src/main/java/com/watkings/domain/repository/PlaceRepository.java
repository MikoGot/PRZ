package com.watkings.domain.repository;

import java.util.List;

import com.watkings.domain.entity.Place;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface PlaceRepository extends CrudRepository<Place, Long> {

	public Place findById(int id);
	public List<Place> findByName(@Param("name") String name);
	public List<Place> findAll();
	
	@Query(value="SELECT ID FROM PLACE LIMIT 1", nativeQuery = true)
	public int getRandomPlace();

}