package projetfinale.finale.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetfinale.finale.entite.Produit;
import projetfinale.finale.repository.ProduitRepo;

@Service
public class GestionProduit implements IProduit {
@Autowired
ProduitRepo Pr ;

public GestionProduit(ProduitRepo pr) {
	this.Pr=pr;
}

@Override
public List<Produit>GetAllProduit(){
	return Pr.findAll();
}
@Override
public void Addproduit(Produit P) {
	Pr.save(P);
}
@Override
public void deleteProduct(Long id) {
	Pr.deleteById(id);
}
@Override
public Optional getById(Long id) {
	return Pr.findById(id);
}
@Override
public List<Produit>rechercheparmotcle(String mc){
	return Pr.findByNomContains(mc);
}
public Produit update(Long id ,Produit produit) {
	 Produit updatedProduit = Pr.findById(id).orElse(null);
	 updatedProduit.setNom(produit.getNom());
	 updatedProduit.setPrix(produit.getPrix());
	 updatedProduit.setCategorie(produit.getCategorie());
	 return Pr.save(updatedProduit);
}




}
