package app.rh.java.controllers;

import app.rh.java.entitys.Vacancies;
import app.rh.java.repositiry.VacanciesRepository;
import app.rh.java.repositiry.CandidateRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Vacancies")
public class VacanciesController {
   private VacanciesRepository vacanciesRepository;
   private CandidateRepository candidateRepository;

    public VacanciesController(VacanciesRepository vacanciesRepository, CandidateRepository candidateRepository) {
        this.vacanciesRepository = vacanciesRepository;
        this.candidateRepository = candidateRepository;
    }

    @GetMapping("/")
   public List<Vacancies> GetVacancies(){
     return vacanciesRepository.findAll();
   }

   @



}
