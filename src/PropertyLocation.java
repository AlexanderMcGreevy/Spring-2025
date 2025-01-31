import java.awt.*;
public class PropertyLocation  extends BoardLocation{

    private Color color;
    private int price;
    private int rent;
    private String owner;
    private int multiplier;

    public PropertyLocation(String name, int location, String description, Color color, int price, int rent) {
        super(name, location, description);
        this.color = color;
        this.price = price;
        this.rent = rent;
        this.owner= String.valueOf(' ');
        this.multiplier=1;
    }


    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getRent() {
        return rent;
    }

    public String getOwner() {
        return owner;
    }


    public int getMultiplier() {
        return multiplier;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void increaseMultiplier(){
        multiplier = (multiplier >=5?5:multiplier+1);
    }

    @Override
    public void changeOwner(String owner){
        this.owner = owner;

    }

    @Override
    public String toString() {
        return "PropertyLocation{" +
                "name=" +getName()+
                ", location=" +getLocation()+
                ", description=" +getDescription()+
                "color=" + color +
                ", price=" + price +
                ", rent=" + rent +
                ", owner='" + owner + '\'' +
                ", multiplier=" + multiplier +
                "} " ;
    }
}
