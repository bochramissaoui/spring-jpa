package projetfinale.finale;
import projetfinale.finale.entite.Categorie;
import projetfinale.finale.entite.Produit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import projetfinale.finale.repository.CategorieRepo;
import projetfinale.finale.repository.ProduitRepo;

@SpringBootApplication
public class FinaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinaleApplication.class, args);
		
	}
	
	
	
	@Bean
	CommandLineRunner start(ProduitRepo produitRepository , CategorieRepo categorieRepo) {
		return args->{
			/*
			 * produitRepository.findByNomAndPrix("imp", 750).forEach(p->{
			 * System.out.println(p.getNom()); });
			 * 
			 * produitRepository.trierProduitsNomsPrix().forEach(p->{
			 * System.out.println(p.getNom()); });
			 */
		
			/*
			 * Categorie c = new Categorie(null,"informatique",null); categorieRepo.save(c);
			 * Categorie c1 = new Categorie(null,"Electro",null); categorieRepo.save(c1);
			 * produitRepository.save(new Produit(null,"pc portable",1500, c));
			 * produitRepository.save(new Produit(null,"imp",750,c1));
			 * produitRepository.findAll().forEach(p->{ System.out.println(p.getNom()); });
			 */

		};
	}
}

