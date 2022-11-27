package house_of_baratheon;

public class Person {                       //Create a Person class
    private String name, gender;

    public Person(String name, String gender) {
        this.setName(name);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name+","+gender;
    }
}
