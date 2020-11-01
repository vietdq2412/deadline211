package Model;

public class Customer {
    private int ID;
    private String name;
    private int age;


    public Customer() {
    }

    public Customer(int id, String name, int age) {
        this.ID = id;
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
