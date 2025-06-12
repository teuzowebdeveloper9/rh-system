package app.rh.java.controllers;

import app.rh.java.DTOs.CandidatesDTO;
import app.rh.java.entitys.Candidates;
import app.rh.java.repositiry.CandidateRepository;
import app.rh.java.services.CandidatesService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/candidates")
@RestController
public class CandidatesController {

    private CandidateRepository candidateRepository;
    private CandidatesService candidatesService;

    public CandidatesController(CandidateRepository candidateRepository, CandidatesService candidatesService) {
        this.candidateRepository = candidateRepository;
        this.candidatesService = candidatesService;
    }

    @GetMapping("/")
    public List<Candidates> getAllCandidates(){
        return this.candidateRepository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Candidates> createCandidates(@Valid @RequestBody CandidatesDTO candidatesDTO){

        return candidatesService.createCandidates(candidatesDTO);

    }
}
