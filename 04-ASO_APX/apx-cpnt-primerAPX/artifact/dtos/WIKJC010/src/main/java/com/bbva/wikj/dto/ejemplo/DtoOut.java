package com.bbva.wikj.dto.ejemplo;

public class DtoOut {

    private String firstName;
    private String lastName;
    private IdentityDocuments identityDocuments;

    public IdentityDocuments getIdentityDocuments() {
        return identityDocuments;
    }

    public void setIdentityDocuments(IdentityDocuments identityDocuments) {
        this.identityDocuments = identityDocuments;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
