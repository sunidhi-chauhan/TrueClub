package com.TureClub.Demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TureClub.Demo.dao.TrueClub;
import com.TureClub.Demo.exception.MemberException;
import com.TureClub.Demo.repositery.TrueClubDao;

@Service
public abstract class TrueClubServicesImpl implements TrueClubServices {
	
	
	//Reference variables touch to my data Access Layer
	
	@Autowired
	
	private TrueClubDao dao;

	
	//1. save(Insert new Record) the TrueClub Member on Database
	
	@Override
	public TrueClub saveMember(TrueClub trueclub) {
		
	TrueClub saveMember	= dao.save(trueclub);
		
		return saveMember;
	}

	
	
	
	//1. Get the record base on giving id
	
	@Override
	public TrueClub getMemberByid(Integer id) throws MemberException{
		
		Optional<TrueClub> opt =dao.findById(id);//Optional deal with NullPointer Exception
		
		if(opt.isPresent()) {
			
			
			return opt.get();
		}
		
		else {
			throw new MemberException("Member does not Exist with proper id: "+id);
			
		}
		
		
	}

	
	
	
	//Update the Record
	
	@Override
	public TrueClub updateMemberDetails(TrueClub trueClub )  throws MemberException{
		
		
		//First check Member it is there or not.
		
  Optional<TrueClub>   opt	=  dao.findById(trueClub.getId());
  
  if(opt.isPresent()) {
	  
	  
	  return dao.save(trueClub);
	  
	  //here save method will perform as saveOrUpdate Based on Id Field.
  }
  else {
	  
	  throw new MemberException("Invalid Member details");
	  
  }
  
  
	}

	
	
	//4. Delete the Record on Database
	
	
	@Override
	public TrueClub deleteMemberById(Integer id) throws MemberException {
		
		//You can also use Optional.
		TrueClub existingMember = dao.findById(id).orElseThrow(() -> new MemberException("Member does't exist with id"+id));
		
		return existingMember;
	}

	
	
	//5. Get All the TrueClubMember Record
	
	
	
	@Override
	public List<TrueClub> getAllMemberRecord() throws MemberException{
		
		//return dao.findAll();
		
		List<TrueClub> tcMember = dao.findAll();
		
		if(tcMember.size()>0) {
			
			return tcMember;
		}
		else {
			
			throw new MemberException("No Member found...");
		}
		
		
	}


	
	
	
	
	

}
