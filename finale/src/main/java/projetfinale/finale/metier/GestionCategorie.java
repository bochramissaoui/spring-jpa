package projetfinale.finale.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetfinale.finale.entite.Categorie;
import projetfinale.finale.repository.CategorieRepo;


@Service
public class GestionCategorie implements ICategory {
@Autowired
CategorieRepo Cr ;

@Override
public List<Categorie>getAllCategorie(){
	return Cr.findAll();
}
@Override
public Categorie getcategoriesparId(Long id) {
	return Cr.findById(id).get();
}
}

