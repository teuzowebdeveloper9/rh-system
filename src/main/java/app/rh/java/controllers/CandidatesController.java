package app.rh.java.controllers;

import app.rh.java.entitys.Candidates;
import app.rh.java.repositiry.CandidateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
