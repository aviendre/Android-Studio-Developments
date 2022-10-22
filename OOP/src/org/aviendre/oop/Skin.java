package org.aviendre.oop;

public class Skin extends Organ{
    private String color;
    private int softness;

    public Skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSkin Color: " + this.getColor() + "\nSkin Softness: " + this.getSoftness();
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSoftness() {
        return softness;
    }
    public void setSoftness(int softness) {
        this.softness = softness;
    }

}
