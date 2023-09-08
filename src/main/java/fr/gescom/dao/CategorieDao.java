package fr.gescom.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import fr.gescom.entities.Categorie;
import fr.gescom.repository.CategorieRepository;

//@Component
@Service
public class CategorieDao {
	
	@Autowired
	private CategorieRepository categorieRepository;
	/**
	 * Cette méthode retourne la liste des catégories
	 * @return
	 */
	public List<Categorie> getAllCategorie(){
		return this.categorieRepository.findAll();
	}
	/*
	 * 
	 */
	public void insertCategorie(Categorie categorie) {
		this.categorieRepository.save(categorie);
	}
	public void deleteCategorie(Categorie categorie) {
		this.categorieRepository.delete(categorie);
	}
	public void updateCategorie(Categorie categorie) {
		//this.insertCategorie(categorie);
		this.categorieRepository.save(categorie);
	}
	public Categorie getOnecategorieById(int id) {
		//return this.categorieRepository.findById(id);
		return this.categorieRepository.getById(id);
	}
}
