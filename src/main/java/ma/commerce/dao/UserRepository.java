package ma.commerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.commerce.service.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String userName);
}
