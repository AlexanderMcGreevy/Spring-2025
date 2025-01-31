package pets;

public class GoldFish {
    private String name;
    private int age;

    public GoldFish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String doTrick(Pet.command c) {
        switch (c) {
            case SIT:
                return "Goldfish does nothing";
            case FETCH:
                return "Goldfish does nothing";
            case JUMP_THROUGH_FIRE_HOOP:
                return "Goldfish does nothing";
            default:
                return "Goldfish does nothing";
        }
    }

    public String toString() {
        return "Pet{" + getClass().getSimpleName().toLowerCase() +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
}
