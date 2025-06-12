package app.rh.java.services;

import app.rh.java.DTOs.VacanciesDTO;
import app.rh.java.entitys.Vacancies;
import app.rh.java.repositiry.VacanciesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class VacanciesService {
    private VacanciesRepository vacanciesRepository;

    public VacanciesService(VacanciesRepository vacanciesRepository) {
        this.vacanciesRepository = vacanciesRepository;
    }

    public ResponseEntity<Vacancies> createVacancy(VacanciesDTO dto){

        Vacancies vacancy = new Vacancies();

        vacancy.setName(dto.getName());
        vacancy.setDescription(dto.getDescription());
        vacancy.setDate(dto.getDate());
        vacancy.setWage(dto.getWage());

        Vacancies savedVacancy = vacanciesRepository.save(vacancy);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedVacancy);
    }
}
