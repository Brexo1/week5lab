package ie.atu;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(){
        this.firstName = "Brendan";
        this.lastName = "S";
        this.age = 21;
    }

    //Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

       public void displayInfo() {
        System.out.println("Name: " +  firstName + " " + lastName + ", Age: " + age);
    }
}
