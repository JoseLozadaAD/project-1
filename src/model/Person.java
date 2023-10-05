package model;

public abstract class Person {
  private String fullName;
  private short age;
  private String phoneNumber;

  public Person (String fullName, short age, String phoneNumber) {
    this.fullName = fullName;
    this.age = age;
    this.phoneNumber = phoneNumber;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public short getAge() {
    return age;
  }

  public void setAge(short age) {
    this.age = age;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public abstract void eat();
}
