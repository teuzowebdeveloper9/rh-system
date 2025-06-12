package app.rh.java.services;

import app.rh.java.entitys.Candidates;
import app.rh.java.entitys.Vacancies;
import app.rh.java.repositiry.CandidateRepository;
import app.rh.java.repositiry.VacanciesRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RegisterService {

    private final VacanciesRepository vacanciesRepository;
    private final CandidateRepository candidateRepository;

    public RegisterService(VacanciesRepository vacanciesRepository, CandidateRepository candidateRepository) {
        this.vacanciesRepository = vacanciesRepository;
        this.candidateRepository = candidateRepository;
    }

    public Vacancies assignCandidateToVacancy(UUID vacancyID, UUID candidateID) throws Exception{
        Vacancies vacacy = vacanciesRepository.findByID(vacancyID)
                .orElseThrow(() -> new RuntimeException("não há vagas com esse id: " + vacancyID));

        Candidates candidate = candidateRepository.findByID(candidateID)
                .orElseThrow(() -> new RuntimeException("não há candidatos com esse id:" + candidateID));


        vacacy.getCandidates().add(candidate);
        candidate.setVacancies(vacacy);
        return vacanciesRepository.save(vacacy);
    }
}
