package fr.gescom.dao;


import jakarta.transaction.Transactional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import fr.gescom.entities.AppRole;
import fr.gescom.entities.AppUser;
import fr.gescom.repository.AppRoleRepository;
import fr.gescom.repository.AppUserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

@Transactional
@Service
public class GestionUserDao {
	
	private AppUserRepository userRepository;
	private AppRoleRepository roleRepository;
	
	private PasswordEncoder passwordEncoder;
	
	
	
	public GestionUserDao(AppUserRepository userRepository, AppRoleRepository roleRepository,
			PasswordEncoder passwordEncoder) {
	
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.passwordEncoder = passwordEncoder;
	}
	public void insertUser(AppUser appUser) {
		//1-	Encoder le password de l'utilisateur
			//1-1	récupération du mot de passe dans l'objet
			String pwd = appUser.getPassword();
			//1-2	On encode le mot de passe
			String pwdCrypter = this.passwordEncoder.encode(pwd);			
			//1-3	On stocke le mot de passe encodé dans l'objet appUser
			appUser.setPassword(pwdCrypter);
			
			//1-4	On enregistre l'utilisateur dans la base 
		this.userRepository.save(appUser);
	}
	/**
	 * @param appRole
	 */
	public void insertRole(AppRole appRole) {
		this.roleRepository.save(appRole);
	}
	public void addRoleToUser(AppRole appRole,AppUser appUser) {
		AppRole role = this.
							roleRepository
							.getById(appRole.getIdRole());
		AppUser user = this.
							userRepository
							.getById(appUser.getIdUser())	;	
	
		user.getListRoles().add(role);
	}
	
	public AppUser findUserByUsername(String username) {
		return this.userRepository.findUserByUsername(username);
	}
	/*
	 * public AppRole findRoleByRole(String role) { return
	 * this.roleRepository.findRoleByRole(role); }
	 */
	
}
