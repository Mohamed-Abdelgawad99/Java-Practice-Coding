package person;

public class Person {

    private String name;
    private double age;

    public Person(){
        name = "";
        age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void printID(){
        System.out.println("This person name is "+ this.name+ " and has "+this.age+" years old.");
    }

}


