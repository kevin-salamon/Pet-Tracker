import java.util.ArrayList;
import java.util.Scanner;

public class Tracker {

    protected String name;
    protected int age;
    protected String color;

    Tracker(String fullName, int years, String colorCoat) {
        this.name = fullName;
        this.age = years;
        this.color = colorCoat;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Pet Tracker! Here, you can organize all your pets in one simple program.");
        ArrayList<Cat> cats = new ArrayList<Cat>();
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        ArrayList<Fish> fish = new ArrayList<Fish>();

        System.out.println("First, let's get your name: ");
        Scanner key = new Scanner(System.in);
        String petOwnerName = key.nextLine();
        System.out.println("Okay, so your name is " + petOwnerName + ".");
        System.out.println("Now, let's begin by entering your pets.");

        while (true) {
            System.out.println("What pet would you like to add?");
            System.out.println("1. Add a dog.");
            System.out.println("2. Add a cat.");
            System.out.println("3. Add a fish.");
            System.out.println("4. I've added all my pets.");
            if (key.hasNextInt()) {
                int petChoice = key.nextInt();
                if (petChoice == 1) {

                } else if (petChoice == 2) {

                } else if (petChoice == 3) {

                } else if (petChoice == 4) {

                } else {
                    System.out.println("Please choose from the available 4 options.");
                }
            } else {
                System.out.println("Please choose from the available 4 options.");
                key.next();
            }
        }
    }


}
