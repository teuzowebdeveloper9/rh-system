package app.rh.java.services;

import app.rh.java.DTOs.CandidatesDTO;
import app.rh.java.entitys.Candidates;
import app.rh.java.repositiry.CandidateRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CandidatesService {
    private CandidateRepository candidateRepository;

    public CandidatesService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public ResponseEntity<Candidates> createCandidates(CandidatesDTO candidatesDTO){
        Candidates candidate = new Candidates();

        candidate.setCpf(candidatesDTO.getCpf());
        candidate.setEmail(candidatesDTO.getEmail());
        candidate.setName(candidatesDTO.getName());

        Candidates savedCandidate = candidateRepository.save(candidate);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedCandidate);

    }
}
