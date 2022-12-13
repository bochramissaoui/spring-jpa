package projetfinale.finale.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import projetfinale.finale.entite.Produit;
import projetfinale.finale.repository.ProduitRepo;

@RestController
public class RestControlleur {
	
	@Autowired
	ProduitRepo pr ;
	
	@GetMapping("/produits")
	public List<Produit> listProduit(){
		 List<Produit> produits = pr.findAll() ;
		return produits;
	}
	@PostMapping("/produit/add")
	public Produit save(@RequestBody Produit produit) {
		return pr.save(produit);
	}
	

}
