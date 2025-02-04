package boardgame;
public class BoardLocation {
    private String name;
    private int location;
    private String description;

    public BoardLocation(String name, int location, String description){
        this.name = name;
        this.location = location;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }
    public int getLocation(){
        return this.location;
    }
    public String getDescription(){
        return this.description;
    }

    public String toString(){
        return "Board Location:\nName: " + this.name + "\nLocation: " + this.location + "\nDescription: " + this.description + "\n";
    }
    public void setName(String name){
        this.name = name;
    }

    //class PropertyLocation(BoardLocation)
}
