package pets;

public class PetTester {
    public static void main(String[] args) {
        // Original setup
        Dog dog = new Dog("Fido", 3, true);
        GoldFish goldFish = new GoldFish("Goldie", 1);

        System.out.println(dog);
        System.out.println(goldFish);

        System.out.println("Dog: " + dog.doTrick(Pet.command.SIT));
        System.out.println("Dog: " + dog.doTrick(Pet.command.FETCH));
        System.out.println("Dog: " + dog.doTrick(Pet.command.JUMP_THROUGH_FIRE_HOOP));

        System.out.println("GoldFish: " + goldFish.doTrick(Pet.command.SIT));
        System.out.println("GoldFish: " + goldFish.doTrick(Pet.command.FETCH));
        System.out.println("GoldFish: " + goldFish.doTrick(Pet.command.JUMP_THROUGH_FIRE_HOOP));

        //equals and hashCode testing
        Dog d1 = new Dog("Buddy", 5, true);
        Dog d2 = new Dog("Buddy", 5, true);
        Dog d3 = new Dog("Max", 7, false);

        System.out.println("d1 equals d2: " + d1.equals(d2)); // Should print true
        System.out.println("d1 equals d3: " + d1.equals(d3)); // Should print false
        System.out.println("d2 equals d3: " + d2.equals(d3)); // Should print false

        System.out.println("HashCode of d1: " + d1.hashCode());
        System.out.println("HashCode of d2: " + d2.hashCode());
        System.out.println("HashCode of d3: " + d3.hashCode());
    }
}
