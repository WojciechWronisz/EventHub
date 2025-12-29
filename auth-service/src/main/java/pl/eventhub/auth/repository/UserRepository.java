package pl.eventhub.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.eventhub.auth.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}
