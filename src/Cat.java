import java.util.Scanner;

public class Cat extends Tracker {

    protected String consistency;

    Cat() {
        super("","","");
    }

    public void addCat() {
        String petType = "cat";
        super.addPet(petType);
        Scanner key = new Scanner(System.in);
        System.out.println("Is this a long or short-haired cat?");
        consistency = key.nextLine();
        System.out.println("This cat has been added!");
    }
}