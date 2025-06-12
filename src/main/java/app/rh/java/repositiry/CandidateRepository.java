package app.rh.java.repositiry;

import app.rh.java.entitys.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface candidateRepository extends JpaRepository<Candidates, UUID> {
}
