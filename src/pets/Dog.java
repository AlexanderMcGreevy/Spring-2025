package pets;

import java.util.Objects;

public class Dog extends Pet {

    private boolean likesToFetch;


    public Dog(String name, int age) {
        this(name, age, false);
    }
    public Dog(String name, int age, boolean likesToFetch) {
        super(name, age);
        this.likesToFetch = likesToFetch;
    }

    public boolean isLikesToFetch() {
        return likesToFetch;
    }


    @Override
    public response doTrick(command com) {
        switch (com) {
            case SIT:
                return response.SITS;
            case FETCH:
                return response.FETCHES;
            case JUMP_THROUGH_FIRE_HOOP:
                return response.JUMPS_THROUGH_FIRE_HOOP;
            default:
                return response.DOES_NOTHING;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null || getClass() != obj.getClass()) 
            return false;
        if (!super.equals(obj)) return false;
            Dog dog = (Dog) obj;
        return likesToFetch == dog.likesToFetch;
}
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), likesToFetch);
    }

    
}
