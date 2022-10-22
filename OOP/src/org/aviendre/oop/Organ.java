package org.aviendre.oop;

public class Organ {
    public String name, medicalCondition;

    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nMedical Condition: " + medicalCondition;
    }
}
