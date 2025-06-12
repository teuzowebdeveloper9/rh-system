package app.rh.java.repositiry;

import app.rh.java.entitys.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CandidateRepository extends JpaRepository<Candidates, UUID> {

}
