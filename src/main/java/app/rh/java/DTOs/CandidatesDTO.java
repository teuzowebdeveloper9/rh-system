package app.rh.java.DTOs;

import jakarta.validation.constraints.NotEmpty;

public class CandidatesDTO {

     @NotEmpty
     private String cpf;

     @NotEmpty
     private String name;

     @NotEmpty
    private String email;
}
