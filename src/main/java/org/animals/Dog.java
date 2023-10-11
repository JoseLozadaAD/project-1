package org.animals;

public class Dog extends Animal {
  private DogBreed dogBreed;

  public Dog(String name) {
    super(name);
  }

  public Dog(String name, DogBreed dogBreed) {
    super(name);
    this.dogBreed = dogBreed;
  }

  public DogBreed getDogBreed() {
    return dogBreed;
  }

  public void setDogBreed(DogBreed dogBreed) {
    this.dogBreed = dogBreed;
  }

  @Override
  String onomatopeya() {
    return "Guao guao";
  }

  @Override
  public String toString() {
    return "Dog{" +
        "name='" + super.getName() + '\'' +
        '}';
  }
}