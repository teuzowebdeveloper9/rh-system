package app.rh.java.controllers;


import app.rh.java.entitys.Candidates;
import app.rh.java.entitys.Vacancies;
import app.rh.java.services.SearchServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/search")
public class SearchController {

    private SearchServices searchServices;


    public SearchController(SearchServices searchServices) {
        this.searchServices = searchServices;
    }

    @GetMapping("/Vacancies")
    public List<Vacancies> searchByName(String name) throws Exception{

        return searchServices.searchByName(name);
    }

    @GetMapping("/candidates")
    public Optional<Candidates> searchCandidatesByName (String name) throws  Exception{

        return searchServices.serarchCandidateByName(name);
    }
}
