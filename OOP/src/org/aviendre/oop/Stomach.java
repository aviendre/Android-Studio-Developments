package org.aviendre.oop;

public class Stomach extends Organ {
    private boolean isEmpty;

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    public void digest(){
        System.out.println("Digesting...");
    }

    @Override
    public String toString() {
        String stomachString;
        if(this.isEmpty())
            stomachString = "\nStomach is empty";
        else
            stomachString = "\nStomach is full";
        return super.toString() + stomachString;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }


}
