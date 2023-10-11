package org.animals;

public class Cat extends Animal {
 private CatBreed catBreed;

  public Cat(String name) {
    super(name);
  }

  @Override
  String onomatopeya() {
    return "Miau miau";
  }

  public Cat(String name, CatBreed catBreed) {
    super(name);
    this.catBreed = catBreed;
  }

  public CatBreed getCatBreed() {
    return catBreed;
  }

  public void setCatBreed(CatBreed catBreed) {
    this.catBreed = catBreed;
  }

  @Override
  public String toString() {
    return "Cat{" +
        "catBreed=" + catBreed +
        '}';
  }
}