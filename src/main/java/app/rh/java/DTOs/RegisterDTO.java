package app.rh.java.DTOs;

import java.util.UUID;

public class RegisterDTO {

    private UUID vacancyID;
    private UUID candidateID;

    public UUID getVacancyID() {
        return vacancyID;
    }

    public void setVacancyID(UUID vacancyID) {
        this.vacancyID = vacancyID;
    }

    public UUID getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(UUID candidateID) {
        this.candidateID = candidateID;
    }
}
