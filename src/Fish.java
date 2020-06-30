import java.util.Scanner;

public class Fish extends Tracker {

    public String size;

    Fish() {
        super("","","");
    }

    public void addFish() {
        String petType = "fish";
        super.addPet(petType);
        Scanner key = new Scanner(System.in);
        System.out.println("How large is this fish? Small, medium, or large?");
        size = key.nextLine();
        System.out.println("This fish has been added!");
    }
}