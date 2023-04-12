package com.TNS.Admin_service;
 
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

import jakarta.persistence.NoResultException;
@RestController

public class Admin_service_controller {
	@Autowired
 private Admin_service a;
	@GetMapping("/adminservice")
 public List<Admin>list()
 {
	 return a.listAll();
 }
	@GetMapping("/admin/(Ad_id)")
public ResponseEntity<Admin> get(@PathVariable Integer Ad_id)
{
	try
	{
		Admin Adn= a.get(Ad_id);
		return new ResponseEntity<Admin>(Adn,HttpStatus.OK);
	}
	catch (NoResultException e)
	{
		return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
	}
}
	@PostMapping("/adminservice")
public void add(@RequestBody Admin Adn)
{
	a.save(Adn);
}
	@PutMapping("/adminservice/(Ad_id)")
public ResponseEntity<?> update(@RequestBody Admin Adn,@PathVariable Integer Ad_id)
{
	Admin existAdmin=a.get(Ad_id);
	a.save(Adn);
	return new ResponseEntity<>(HttpStatus.OK);
}
	@DeleteMapping("/adminservice/(Ad-id)")
public void delete(@PathVariable Integer Ad_id)
{
	a.delet(Ad_id);
	
}
}
	

