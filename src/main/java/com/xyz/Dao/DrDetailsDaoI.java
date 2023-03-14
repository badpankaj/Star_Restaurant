package com.xyz.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyz.Model.DrDetails;

@Repository
public interface DrDetailsDaoI extends JpaRepository<DrDetails, Integer> {
	List<DrDetails> findByfirstName(String Name);
}
