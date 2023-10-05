package model;

import controllers.StudentInterface;

public class Student extends Person implements StudentInterface {
  private String studentId;
  private String grade;

  public Student(String fullName, short age, String phoneNumber) {
    super(fullName, age, phoneNumber);
  }

  @Override
  public void eat() {
    String message = String.format("%s is eating in the patio", super.getFullName());
    System.out.println(message);
  }

  public Student(String fullName, short age, String phoneNumber, String grade, String studentId) {
    super(fullName, age, phoneNumber);
    this.grade = grade;
    this.studentId = studentId;
  }

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  @Override
  public void play() {
    String message = String.format("%s is playing in the patio", super.getFullName());
    System.out.println(message);
  }

  @Override
  public void sleepInClass() {
    String message = String.format("%s is sleeping in class", super.getFullName());
    System.out.println(message);
  }
}
