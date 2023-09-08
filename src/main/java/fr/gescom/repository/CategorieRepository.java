package fr.gescom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.gescom.entities.Categorie;
import lombok.experimental.PackagePrivate;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
	//public Categorie findOneCategorieById(int id);
}
