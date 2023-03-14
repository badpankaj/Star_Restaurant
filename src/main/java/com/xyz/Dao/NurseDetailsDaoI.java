package com.xyz.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.xyz.Model.NurseDetails;

@Repository
public interface NurseDetailsDaoI extends JpaRepository<NurseDetails, Integer> {
	List<NurseDetails>findByfirstName(String Name);
}
