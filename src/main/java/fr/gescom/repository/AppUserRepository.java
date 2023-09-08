package fr.gescom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.gescom.entities.AppUser;

@Repository
public interface AppUserRepository 
	extends JpaRepository<AppUser, Integer>{

	public AppUser findUserByUsername(String username);
}
