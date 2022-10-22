package org.aviendre.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Brad", 28,
                new Eye("Left eye", "Short sighted", "Blue",true),
                new Eye("Right eye", "Normal","Blue",true),
                new Heart("Heart","Normal", 65),
                new Stomach("Stomach", "PUD", false),
                new Skin("Skin", "Burned","White",40));

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shouldFinish = false;
        while(!shouldFinish){
            System.out.println("Choose an Organ: " +
                    "\n\t 1. Left Eye" +
                    "\n\t 2. Right Eye" +
                    "\n\t 3. Heart" +
                    "\n\t 4. Stomach" +
                    "\n\t 5. Skin" +
                    "\n\t 6. Quit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println(patient.getLeftEye().toString());
                    if(patient.getLeftEye().isOpened()){
                        System.out.println("\t\t 1. Close the eye");
                        if(scanner.nextInt() == 1){
                            patient.getLeftEye().close();
                        } else
                            continue;
                    } else {
                        System.out.println("\t\t1. Open the eye");
                        if(scanner.nextInt() == 1){
                            patient.getLeftEye().open();
                        } else
                            continue;
                    }
                    break;

                case 2:
                    System.out.println(patient.getLeftEye().toString());
                    if(patient.getRightEye().isOpened()){
                        System.out.println("\t\t 1. Close the eye");
                        if(scanner.nextInt() == 1){
                            patient.getRightEye().close();
                        } else
                            continue;
                    } else {
                        System.out.println("\t\t1. Open the eye");
                        if(scanner.nextInt() == 1){
                            patient.getRightEye().open();
                        } else
                            continue;
                    }
                    break;

                case 3:
                    System.out.println(patient.getHeart().toString());
                    System.out.println("\t\t1. Change the heart rate");
                    if(scanner.nextInt() == 1){
                        System.out.println("Enter the new heart rate: ");
                        patient.getHeart().setRate(scanner.nextInt());
                        System.out.println("Heart rate is now " + patient.getHeart().getRate() );
                    } else
                        continue;
                    break;

                case 4:
                    System.out.println(patient.getStomach().toString());
                    System.out.println("\t\t1. Digest");
                    if(scanner.nextInt() == 1 )
                        patient.getStomach().digest();
                    else
                        continue;
                    break;

                case 5:
                    System.out.println(patient.getSkin().toString());
                    break;

                default:
                    shouldFinish = true;
                    break;
            }
        }
    }
}
