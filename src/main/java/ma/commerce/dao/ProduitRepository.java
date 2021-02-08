package ma.commerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.commerce.service.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
	List<Produit> findByPrixUnitaire(Double prix);
	Produit findByName(String name);	

}
