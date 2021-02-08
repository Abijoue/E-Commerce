package ma.commerce.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import ma.commerce.service.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long>{

}
