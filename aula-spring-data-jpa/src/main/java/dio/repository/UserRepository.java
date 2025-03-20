package dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
