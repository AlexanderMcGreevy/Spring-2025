package pets;
public abstract class Pet {
        enum command {SIT, FETCH, JUMP_THROUGH_FIRE_HOOP}
    

    enum response {SITS, FETCHES, DOES_NOTHING, JUMPS_THROUGH_FIRE_HOOP}
    
    private String name;
    private int age;

    public Pet(String name, int age) {
        //throw new UnsupportedOperationException("Not implemented yet");
        this.name = name;
        this.age = age;
    }


    //gettr and setter methods
    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    //Add abstract method to have pet do a trick
    public abstract response doTrick(command c);



    public String toString() {
        return "Pet{" + getClass().getSimpleName().toLowerCase() +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
