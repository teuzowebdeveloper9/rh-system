package app.rh.java.repositiry;

import app.rh.java.entitys.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CandidateRepository extends JpaRepository<Candidates, UUID> {


    public Optional<Candidates> findByID(UUID id);
}
