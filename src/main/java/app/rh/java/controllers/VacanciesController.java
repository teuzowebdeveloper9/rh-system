package app.rh.java.controllers;

import app.rh.java.DTOs.VacanciesDTO;
import app.rh.java.entitys.Vacancies;
import app.rh.java.repositiry.VacanciesRepository;
import app.rh.java.repositiry.CandidateRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

   @GetMapping("/search")
   public List<Vacancies> searchByName(@RequestParam String name){
        return vacanciesRepository.findByName(name);
   }

   @PostMapping("/")
   public ResponseEntity<Vacancies>  createVacancies(@Valid @RequestBody VacanciesDTO dto){
        Vacancies vacancy = new Vacancies();

        vacancy.setName(dto.getName());
        vacancy.setDescription(dto.getDescription());
        vacancy.setDate(dto.getDate());
        vacancy.setWage(dto.getWage());

        Vacancies savedVacancy = vacanciesRepository.save(vacancy);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedVacancy);
   }



}
