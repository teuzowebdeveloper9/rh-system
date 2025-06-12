package app.rh.java.services;

import app.rh.java.entitys.Vacancies;
import app.rh.java.exceptions.VacanciesNotFoundException;
import app.rh.java.repositiry.VacanciesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServices {
    private VacanciesRepository vacanciesRepository;

    public SearchServices(VacanciesRepository vacanciesRepository) {
        this.vacanciesRepository = vacanciesRepository;
    }

    public List<Vacancies> searchByName(String name) throws Exception {
        List<Vacancies> vacancies = vacanciesRepository.findByName(name);
        if (vacancies.isEmpty()){

            throw new VacanciesNotFoundException("Nenhuma vaga encontrada com o nome: " + name);
        }

        return vacancies;
    }
}
