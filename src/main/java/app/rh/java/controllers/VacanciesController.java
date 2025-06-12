package app.rh.java.controllers;

import app.rh.java.DTOs.VacanciesDTO;
import app.rh.java.entitys.Vacancies;
import app.rh.java.repositiry.VacanciesRepository;
import app.rh.java.services.VacanciesService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Vacancies")
public class VacanciesController {
   private VacanciesRepository vacanciesRepository;
   private VacanciesService vacanciesService;

    public VacanciesController(VacanciesRepository vacanciesRepository, VacanciesService vacanciesService) {
        this.vacanciesRepository = vacanciesRepository;
        this.vacanciesService = vacanciesService;
    }

    @GetMapping("/")
   public List<Vacancies> GetVacancies(){
     return vacanciesRepository.findAll();
   }



   @PostMapping("/")
   public ResponseEntity<Vacancies>  createVacancies(@Valid @RequestBody VacanciesDTO dto){

        return vacanciesService.createVacancy(dto);
   }



}
