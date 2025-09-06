package caioneves05.barber_cut_server.domain.repository;

import caioneves05.barber_cut_server.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailAndDocument(String email, String document);

}

