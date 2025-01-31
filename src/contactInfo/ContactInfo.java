package contactInfo;

import java.util.ArrayList;
import java.util.List;

public class ContactInfo {
    //Class Level variables
    private String name;
    private String phone;
    private String email;
    private String street;
    private String city;
    private String state;
    private String zip;


    //Constructor

    public ContactInfo(String name, String phone, String email, String street, String city, String state, String zip) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    //toString

    @Override
    public String toString() {
        return
                "\nname:'" + name + '\'' +
                ", \nphone:'" + phone + '\'' +
                ", \nemail:'" + email + '\'' +
                ", \nstreet:'" + street + '\'' +
                ", \ncity:'" + city + '\'' +
                ", \nstate:'" + state + '\'' +
                ", \nzip:'" + zip + '\'' +
                "}\n";
    }

    public static void main(String[] args) {
        List<ContactInfo> list = new ArrayList();
        list.add(new ContactInfo("BOB","213-211-4563", "JEKLVBIRWYDS@EMAIL.COM", "Barn","Jersey", "NJ", "09257"));
        list.add(new ContactInfo("MARLEY","542-211-4563", "daman@EMAIL.COM", "bale","Hoboken", "PA", "134542"));
        list.add(new ContactInfo("GERALD","124-211-4563", "uhhhhhh@EMAIL.COM", "pop","Altoona", "KA", "345432"));
        list.add(new ContactInfo("BINGORNICUS O'NEAL III","087-211-4563", "email@EMAIL.COM", "Gold","Lil Town", "WA", "56323"));

        for (ContactInfo contactInfo : list) {
            System.out.println(contactInfo);
        }

    }
}
