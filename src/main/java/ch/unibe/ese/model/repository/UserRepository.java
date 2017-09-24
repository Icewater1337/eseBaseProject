package ch.unibe.ese.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ch.unibe.ese.model.User;



// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findByVorname (String vorname);
}
