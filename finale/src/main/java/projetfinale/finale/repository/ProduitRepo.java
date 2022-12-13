package projetfinale.finale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import projetfinale.finale.entite.Produit;

public interface ProduitRepo extends JpaRepository<Produit , Long>{
	
	 public List<Produit> findByNomContains(String nom) ;
	 public List<Produit> findByNomOrderByPrixAsc(String nom);
	 public List<Produit> findByNomAndPrix(String nom , double prix);
	 public List<Produit> findByPrixLessThan(double prix);
	 public List<Produit> findFirst5ByNomOrderByNomAsc(String nom);

	  @Query("select p from Produit p where p.nom like : x")
	  List<Produit>RechercherProduit(@Param("x")String nom);
	  
	  @Query("select p from Produit p order by p.nom ASC , p.prix DESC")
	  public List<Produit> trierProduitsNomsPrix();

}
/*	  

	 }*/
