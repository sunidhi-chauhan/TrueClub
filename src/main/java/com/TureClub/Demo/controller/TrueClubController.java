package com.TureClub.Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TureClub.Demo.dao.TrueClub;
import com.TureClub.Demo.exception.MemberException;
import com.TureClub.Demo.service.TrueClubServices;



@RestController
public class TrueClubController {
	
	//Reference variables to touch the service layer
	
	@Autowired
	private TrueClubServices services;
	
	
	
	//1. method Signature-> ResponsEntity
	
	@PostMapping("/regMember")
	public  ResponseEntity<TrueClub> registerStudentHandler(TrueClub trueClub) {
		
		
		
	TrueClub saveMember	=services.saveMember(trueClub);
	
	
	return new ResponseEntity<TrueClub> (saveMember,HttpStatus.CREATED);
	
		
		
	}
	
	
	
	//2. Get the Record base on the given id.
	
	@GetMapping("regMember/{id}")
	
	public ResponseEntity<TrueClub> getMemberByHandler(@PathVariable("id") Integer id) throws MemberException {
		
		
	TrueClub trueClub = services.getMemberByid(id);
	
	
	return new ResponseEntity<TrueClub>(trueClub, HttpStatus.OK);
		
		
	}
	
	
	
	
	//3. Update the Record.
	
	@PutMapping("/member")
	public ResponseEntity<TrueClub> updateMemberByHandler(@RequestBody TrueClub trueClub) throws MemberException{
		
		
		TrueClub updateMember = services.updateMemberDetails(trueClub);
		
		return new ResponseEntity<TrueClub>(updateMember,HttpStatus.OK);
		

	}
	
	
	
	//4. Delete the Record
	
	@DeleteMapping("delMember/{id}")
	
	public ResponseEntity<TrueClub> deleteMemberByHandler(@PathVariable("id") Integer id) throws MemberException {
		
		
		
		TrueClub deleteMember = services.deleteMemberById(id);
		
		return new ResponseEntity<TrueClub>(deleteMember, HttpStatus.OK);
		
	}
	
	
	
	//5. Get all TrueClub Member Record
	
	
	public ResponseEntity<List<TrueClub>>getAllDetailsHandler()throws MemberException{
		
		List<TrueClub> trueClubs = services.getAllMemberRecord();
		
		
		return new ResponseEntity<List<TrueClub>>(trueClubs, HttpStatus.OK);
	}

}
