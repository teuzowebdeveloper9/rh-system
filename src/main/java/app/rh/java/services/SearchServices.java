package app.rh.java.services;

import app.rh.java.entitys.Candidates;
import app.rh.java.entitys.Vacancies;
import app.rh.java.exceptions.CandidatesNotFoundException;
import app.rh.java.exceptions.VacanciesNotFoundException;
import app.rh.java.repositiry.CandidateRepository;
import app.rh.java.repositiry.VacanciesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SearchServices {
    private VacanciesRepository vacanciesRepository;
    private CandidateRepository candidateRepository;

    public SearchServices(VacanciesRepository vacanciesRepository, CandidateRepository candidateRepository) {
        this.vacanciesRepository = vacanciesRepository;
        this.candidateRepository = candidateRepository;
    }

    public List<Vacancies> searchByName(String name) throws Exception {
        List<Vacancies> vacancies = vacanciesRepository.findByName(name);
        if (vacancies.isEmpty()){

            throw new VacanciesNotFoundException("Nenhuma vaga encontrada com o nome: " + name);
        }

        return vacancies;
    }

    public Optional<Candidates> serarchCandidateByName(String name) throws Exception{
        Optional<Candidates> candidates = candidateRepository.findByName(name);
        if(candidates.isEmpty()){
            throw new CandidatesNotFoundException("nenhum candidato encontrado com o nome:" + name);
        }
        return candidates;
    }
}
