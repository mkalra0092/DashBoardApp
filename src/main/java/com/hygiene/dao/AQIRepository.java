package com.hygiene.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hygiene.pojos.AQIDate;

public interface AQIRepository extends JpaRepository<AQIDate, Integer> {

	AQIDate findByDateTime(Date dt);

//	@Query("Select a from AQI_Date a left outer join fetch a.measurement_")
//	AQI_Date fetchByDateTime(Date dt);

}
