package app.rh.java.repositiry;

import app.rh.java.entitys.Vacancies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VacanciesRepository extends JpaRepository<Vacancies, UUID> {

}
