package app.rh.java.controllers;

import app.rh.java.DTOs.RegisterDTO;
import app.rh.java.entitys.Vacancies;
import app.rh.java.services.RegisterService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/asign")
public class assignCandidateController {
    private final RegisterService registerService;

    public assignCandidateController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping
    public String assignCandidate(@Valid @RequestBody RegisterDTO registerDTO) throws Exception {

        UUID CandidateID = registerDTO.getCandidateID();
        UUID VacancyID = registerDTO.getVacancyID();


        Vacancies response = registerService.assignCandidateToVacancy(CandidateID, VacancyID);

         return  response.toString();
    }

}
