package projetfinale.finale.metier;

import java.util.List;
import java.util.Optional;

import projetfinale.finale.entite.Produit;

public interface IProduit {
List<Produit> GetAllProduit();
void Addproduit(Produit p);
void deleteProduct(Long id);
Produit update(Long id,Produit p);
Optional getById(Long id);
List<Produit>rechercheparmotcle(String mc);
}
