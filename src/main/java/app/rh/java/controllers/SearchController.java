package app.rh.java.controllers;

import app.rh.java.entitys.Vacancies;
import app.rh.java.repositiry.VacanciesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {
    private VacanciesRepository vacanciesRepository;


    public SearchController(VacanciesRepository vacanciesRepository){
        this.vacanciesRepository = vacanciesRepository;
    }

    @GetMapping
    public List<Vacancies> searchByName(@RequestParam String name){
        return vacanciesRepository.findByName(name);
    }
}
