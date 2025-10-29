package ma.ws.jaxrs.repository;

import ma.ws.jaxrs.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}

