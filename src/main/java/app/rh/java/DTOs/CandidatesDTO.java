package app.rh.java.DTOs;

import jakarta.validation.constraints.NotEmpty;

public class CandidatesDTO {

     @NotEmpty
     private String cpf;

     @NotEmpty
     private String name;

     @NotEmpty
    private String email;

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
}
