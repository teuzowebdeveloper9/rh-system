package app.rh.java.entitys;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "vacancies")
public class Vacancies implements Serializable {

    @Serial
    private  static final  long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID ID;


    private String name;

    private  String description;

    private LocalDate date ;

    private BigDecimal wage;

    @OneToMany( cascade = CascadeType.REMOVE)
    private List<Candidates> candidates;

    public Vacancies(UUID ID, String name, String description, LocalDate date, BigDecimal wage, List<Candidates> candidates) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.date = date;
        this.wage = wage;
        this.candidates = candidates;
    }

    public Vacancies() {
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getWage() {
        return wage;
    }

    public void setWage(BigDecimal wage) {
        this.wage = wage;
    }

    public List<Candidates> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidates> candidates) {
        this.candidates = candidates;
    }
}
