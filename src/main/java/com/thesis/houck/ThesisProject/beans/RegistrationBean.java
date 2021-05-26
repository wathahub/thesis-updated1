package com.thesis.houck.ThesisProject.beans;

public class RegistrationBean {

    private UserAccountBean userAccount;
    private PatientBean patient;
    private ParentGuardianBean parentGuardian;

    public RegistrationBean() {

    }

    public UserAccountBean getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccountBean userAccount) {
        this.userAccount = userAccount;
    }

    public PatientBean getPatient() {
        return patient;
    }

    public void setPatient(PatientBean patient) {
        this.patient = patient;
    }

    public ParentGuardianBean getParentGuardian() {
        return parentGuardian;
    }

    public void setParentGuardian(ParentGuardianBean parentGuardian) {
        this.parentGuardian = parentGuardian;
    }
}
