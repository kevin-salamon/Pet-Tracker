import java.util.ArrayList;
import java.util.Scanner;

public class Tracker {

    protected String name;
    protected String age;
    protected String color;

    Tracker(String fullName, String years, String colorCoat) {
        this.name = fullName;
        this.age = years;
        this.color = colorCoat;
    }

    void addPet(String petType) {
        Scanner key = new Scanner(System.in);
        System.out.println("What's the name of this " + petType + "?");
        name = key.nextLine();
        System.out.println("Great, so how old is " + name + "?");
        age = key.nextLine();
        System.out.println("Finally, what color is " + name + "?");
        color = key.nextLine();
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
        System.out.println("Now, let's begin by entering your pets. What pet would you like to add first?");

        while (true) {
            System.out.println("1. Add a dog.");
            System.out.println("2. Add a cat.");
            System.out.println("3. Add a fish.");
            System.out.println("4. I've added all my pets.");
            if (key.hasNextInt()) {
                int petChoice = key.nextInt();
                if (petChoice == 1) {
                    Dog newDog = new Dog();
                    newDog.addDog();
                    dogs.add(newDog);
                    System.out.println("That's been added! What pet would you like to add next?");
                } else if (petChoice == 2) {
                    Cat newCat = new Cat();
                    newCat.addCat();
                    cats.add(newCat);
                    System.out.println("That's been added! What pet would you like to add next?");
                } else if (petChoice == 3) {
                    Fish newFish = new Fish();
                    newFish.addFish();
                    fish.add(newFish);
                    System.out.println("That's been added! What pet would you like to add next?");
                } else if (petChoice == 4) {
                    System.out.println("Alright - that's all the pets then.");
                    System.out.println("Okay, so the owner is " + petOwnerName + ". Here are the pets:");
                    System.out.println("Dogs:");
                    for(Dog dog : dogs) {
                        System.out.println(dog.name + " is " + dog.age + " year(s) old. This dog's coat is " + dog.color + " and the breed is " + dog.breed + ".");
                    }
                    System.out.println("Cats:");
                    for(Cat cat : cats) {
                        System.out.println(cat.name + " is " + cat.age + " year(s) old. This cats's coat is " + cat.color + ", and it is a " + cat.consistency + "-haired cat.");
                    }
                    System.out.println("Fish:");
                    for(Fish fishy : fish) {
                        System.out.println(fishy.name + " is " + fishy.age + " year(s) old. This fish's scales are " + fishy.color + ", and it is a " + fishy.size + " fish.");
                    }
                    System.out.println("And that's all the pets! Thanks for using the Pet Tracker today!");
                    break;
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
