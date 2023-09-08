package fr.gescom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.gescom.entities.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer> {

}
