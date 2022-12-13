package projetfinale.finale.metier;

import java.util.List;

import projetfinale.finale.entite.Categorie;

public interface ICategory {
List<Categorie>getAllCategorie();
Categorie getcategoriesparId(Long id);
}
