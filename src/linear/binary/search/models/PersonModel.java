package linear.binary.search.models;

public class PersonModel {
    private String lastName;
    private String firstName;
    private int age;

    public PersonModel(String last, String first, int a) { // constructor
        lastName = last;
        firstName = first;
        age = a;
    }

    public PersonModel(PersonModel personModel){
        this.lastName = personModel.getLastName();
        this.firstName = personModel.getFirstName();
        this.age = personModel.getAge();
    }
    public PersonModel() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayPerson(){
        System.out.print(" Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }

    @Override
    public String toString() {
        return "{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
