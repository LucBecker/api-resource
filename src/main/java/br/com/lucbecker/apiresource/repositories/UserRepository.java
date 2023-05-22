package br.com.lucbecker.apiresource.repositories;

import br.com.lucbecker.apiresource.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
