import java.util.Scanner;

public class Dog extends Tracker {

    protected String breed;

    Dog() {
        super("","","");
    }

    public void addDog() {
        String petType = "dog";
        super.addPet(petType);
        Scanner key = new Scanner(System.in);
        System.out.println("What is this dog's breed?");
        breed = key.nextLine();
        System.out.println("This dog has been added!");
    }
}