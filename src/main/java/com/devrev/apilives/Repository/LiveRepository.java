package com.devrev.apilives.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devrev.apilives.entity.Live;

@Repository
public interface LiveRepository extends JpaRepository<Live, Long>{

}
