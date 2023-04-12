package com.TNS.Admin_service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class Admin_service {

	@Autowired
	private Admin_service_repository repo;
	public List<Admin> listAll()
	{
		return repo.findAll();
	}
	public Admin get(Integer Ad_id)
	{
		return repo.findById(Ad_id).get();
	}
	public void delet(Integer Ad_id)
	{
		repo.deleteById(Ad_id);
	}
	public void save(Admin Ad)
	{
		repo.save(Ad);
	}
}
