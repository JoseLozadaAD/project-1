package org.animals;

public class Rabbit extends Animal {
  private RabbitBreed rabbitBreed;

  public Rabbit(String name) {
    super(name);
  }

  public Rabbit(String name, RabbitBreed rabbitBreed) {
    super(name);
    this.rabbitBreed = rabbitBreed;
  }

  public RabbitBreed getRabbitBreed() {
    return rabbitBreed;
  }

  public void setRabbitBreed(RabbitBreed rabbitBreed) {
    this.rabbitBreed = rabbitBreed;
  }

  @Override
  String onomatopeya() {
    return null;
  }

  @Override
  public String toString() {
    return "Rabbit{" +
        "rabbitBreed=" + rabbitBreed +
        '}';
  }
}
