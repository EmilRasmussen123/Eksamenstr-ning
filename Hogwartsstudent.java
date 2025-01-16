import java.util.ArrayList;
import java.util.List;

class Hogwartsstudent {
    private String firstName;
    private String lastName;
    private String house;

    public Hogwartsstudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        if (house.equals("Gryffindor") || house.equals("Hufflepuff") || house.equals("Ravenclaw") || house.equals("Slytherin")) {
            this.house = house;
        } else {
            throw new IllegalArgumentException("Invalid house name: " + house);
        }
    }

    public String toString() {
        return firstName + " " + lastName + " (House: " + house + ")";
    }

    public String getLastName() {
        return lastName;
    }

    public static void main(String[] args) {
        List<Hogwartsstudent> students = new ArrayList<>();

        Hogwartsstudent student1 = new Hogwartsstudent("Harry", "Potter");
        student1.setHouse("Gryffindor");
        students.add(student1);

        Hogwartsstudent student2 = new Hogwartsstudent("Hermione", "Granger");
        student2.setHouse("Gryffindor");
        students.add(student2);

        Hogwartsstudent student3 = new Hogwartsstudent("Draco", "Malfoy");
        student3.setHouse("Slytherin");
        students.add(student3);

        Hogwartsstudent student4 = new Hogwartsstudent("Ron", "weasley");
        student4.setHouse("Ravenclaw");
        students.add(student4);

        Hogwartsstudent student5 = new Hogwartsstudent("Maja","Larsen");
        student5.setHouse("Slytherin");
        students.add(student5);

        students.sort((s1, s2) -> s1.getLastName().compareTo(s2.getLastName()));

        for (Hogwartsstudent student : students) {
            System.out.println(student);
        }
    }
}