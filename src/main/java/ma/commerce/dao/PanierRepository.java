package ma.commerce.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.commerce.service.model.Panier;


public interface PanierRepository extends JpaRepository<Panier, Long> {
	
	Optional<Panier> findById(Long id);
	Panier findByUsername(String name);

	
}
