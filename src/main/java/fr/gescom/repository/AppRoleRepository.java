package fr.gescom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.gescom.entities.AppRole;
import fr.gescom.entities.AppUser;

@Repository
public interface AppRoleRepository 
	extends JpaRepository<AppRole, Integer>	{
	
	public AppRole findRoleByRole(String role);
}
