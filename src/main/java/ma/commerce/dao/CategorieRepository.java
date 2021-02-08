package ma.commerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.commerce.service.model.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long>{
	
//	@Query("SELECT c FROM Categorie c WHERE c.description = ?1")
//	Categorie findByDescription(String in);
	Categorie findByDescription(String desc);	

}
