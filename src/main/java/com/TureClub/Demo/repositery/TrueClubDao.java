package com.TureClub.Demo.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TureClub.Demo.dao.TrueClub;


@Repository
public interface TrueClubDao  extends JpaRepository<TrueClub, Integer>{
	
	//<Entity class name , Id name>
	

}
