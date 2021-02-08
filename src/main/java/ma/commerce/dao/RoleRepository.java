package ma.commerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.commerce.service.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	List<Role> findByRole(String role);
	List<Role> findAll();

}