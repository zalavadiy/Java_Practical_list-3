// Krisha Zalavadiya
// 220130318058
/* class called “Person” with the following properties and methods: 
  A private String called “name” 
  A private int called “age” 
  A constructor that takes in a name and age and sets the corresponding fields. 
  Getter and setters for the name and age fields. 
  A toString() method that returns a string representation of the object. */
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person [name=" + this.name + ", age=" + this.age + "]";
    }
}
public class P16 {

    public static void main(String[] args) {
        Person p1 = new Person("Bhavy", 21);
        System.out.println(p1.toString());
    }
}