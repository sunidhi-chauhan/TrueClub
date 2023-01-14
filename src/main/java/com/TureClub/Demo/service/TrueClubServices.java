package com.TureClub.Demo.service;

import java.util.List;

import com.TureClub.Demo.dao.TrueClub;



public interface TrueClubServices {
	
	
	//Business Logic
	
	//1. Insert new Record on the Database.
	
	public TrueClub saveMember(TrueClub trueclub);
	
	
	//2. Get the record base on given id.
	
	// If my member is not there for that, I use Exception.
	
	public TrueClub getMemberByid(Integer id) ;
	
	
	//3. Update the record.
	
	public TrueClub updateMemberById(Integer id) ;
	
	//4. Delete the record
	
	public TrueClub deleteMemberById(Integer id) ;
	
	
	//Get all record
	
	public List<TrueClub> getAllMemberRecord();
	
	
	

}
