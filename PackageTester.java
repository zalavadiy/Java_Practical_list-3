// Krisha Zalavadiya
// 220130318058
package comtest;

import com_example1.Student;

public class PackageTester {

  public static void main(String[] args) {

    Student student = new Student("Krisha", 21, 38, "Computer Science");
    System.out.println(student);
    
    // Changing the id and major using setters
    student.setId(54321);
    student.setMajor("Master CS Engineering");

    // Printing the string representation of the Student object
    System.out.println(student);
  }
}
