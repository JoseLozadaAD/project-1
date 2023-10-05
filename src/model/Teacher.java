package model;

public class Teacher extends Person {
  private String teacherId;
  private String subject;

  public Teacher(String fullName, short age, String phoneNumber) {
    super(fullName, age, phoneNumber);
  }

  @Override
  public void eat() {
    String message = String.format("%s is eating in the dining room", super.getFullName());
    System.out.println(message);
  }

  public Teacher(String fullName, short age, String phoneNumber, String teacherId, String subject) {
    super(fullName, age, phoneNumber);
    this.teacherId = teacherId;
    this.subject = subject;
  }

  public String getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(String teacherId) {
    this.teacherId = teacherId;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }
}
