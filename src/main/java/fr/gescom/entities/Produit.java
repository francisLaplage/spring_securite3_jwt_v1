package fr.gescom.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_produit")
@Data
@NoArgsConstructor 
@AllArgsConstructor
public class Produit implements Serializable{
	//1-	Attributs
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id_prod")
		private int idProd;
		@Column(name = "nom_prod")
		private String nomProd;
		@Column(name = "description_prod")
		private String descriptionProd;
		@Column(name = "prix_prod")
		private double prixProd;
		@Column(name = "stock_prod")
		private int stockProd;
		@Column(name = "image_prod")
		private String imageProd;
	//2-	attribut de type objet pour la jointure
		@ManyToOne
		@JoinColumn(name = "idCat")
		private Categorie categorieJoin;
		public Produit() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Produit(int idProd, String nomProd, String descriptionProd, double prixProd, int stockProd,
				String imageProd, Categorie categorieJoin) {
			super();
			this.idProd = idProd;
			this.nomProd = nomProd;
			this.descriptionProd = descriptionProd;
			this.prixProd = prixProd;
			this.stockProd = stockProd;
			this.imageProd = imageProd;
			this.categorieJoin = categorieJoin;
		}
		
		
}
