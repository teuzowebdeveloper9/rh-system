package app.rh.java.controllers;


import app.rh.java.entitys.Vacancies;
import app.rh.java.services.SearchServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {

    private SearchServices searchServices;

    public SearchController(SearchServices searchServices) {
        this.searchServices = searchServices;
    }

    @GetMapping
    public List<Vacancies> searchByName(String name) throws Exception{

        return searchServices.searchByName(name);
    }
}
