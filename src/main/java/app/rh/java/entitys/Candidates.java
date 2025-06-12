package app.rh.java.entitys;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Candidates")
public class Candidates {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
     private  UUID ID;

    @Column(unique = true)
    private String cpf;

    private String name;

    @Column(unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "Vacancies_id")
    private Vacancies vacancies;

    public Candidates(UUID ID, String cpf, String name, String email, Vacancies vacancies) {
        this.ID = ID;
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.vacancies = vacancies;
    }

    public Candidates() {
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Vacancies getVacancies() {
        return vacancies;
    }

    public void setVacancies(Vacancies vacancies) {
        this.vacancies = vacancies;
    }
}
