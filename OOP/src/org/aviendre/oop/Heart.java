package org.aviendre.oop;

public class Heart extends Organ {
    private int rate;

    public Heart(String name, String medicalCondition, int rate) {
        super(name, medicalCondition);
        this.rate = rate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHeart rate: " + this.getRate();
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
