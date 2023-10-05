import model.Person;
import model.Student;
import model.Teacher;

public class Main {
  public static void main(String[] args) {
    Student student = new Student(
        "Juan Perez",
        (short) 18,
        "777666111",
        "152364",
        "Senior class");

    Person teacher = new Teacher(
        "Pedro Vigas",
        (short) 50,
        "666222111",
        "T-56",
        "History");

    student.eat();
    student.play();
    student.sleepInClass();
    teacher.eat();
  }
}