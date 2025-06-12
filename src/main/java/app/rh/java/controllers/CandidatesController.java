package app.rh.java.controllers;

import app.rh.java.DTOs.CandidatesDTO;
import app.rh.java.entitys.Candidates;
import app.rh.java.repositiry.CandidateRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/candidates")
@RestController
public class CandidatesController {

    private CandidateRepository candidateRepository;

    public CandidatesController(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @GetMapping("/")
    public List<Candidates> getAllCandidates(){
        return this.candidateRepository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Candidates> createCandidates(@Valid @RequestBody CandidatesDTO candidatesDTO){
        Candidates candidate = new Candidates();

        candidate.setCpf(candidatesDTO.getCpf());
        candidate.setEmail(candidatesDTO.getEmail());
        candidate.setName(candidatesDTO.getName());

        Candidates savedCandidate = candidateRepository.save(candidate);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedCandidate);

    }
}
