import animals.Dog;
import animals.DogBreed;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Dog dog1 = new Dog("Choco", DogBreed.GOLDEN);
    Dog dog2 = new Dog("Whisky", DogBreed.PASTOR_ALEMAN);
    Dog dog3 = new Dog("Tomas", DogBreed.CHIHUAHUA);
    List<Dog> dogs = new ArrayList<>();
    dogs.add(dog1);
    dogs.add(dog2);
    dogs.add(dog3);

    /* Print every dog */
    dogs.forEach(System.out::println);
    /* Filter the GOLDEN breed */
    dogs.stream().filter(dog -> dog.getDogBreed() == DogBreed.GOLDEN).forEach(System.out::println);

    Stream<Dog> copyDogs = dogs.stream().map(dog -> {
      dog.setDogBreed(DogBreed.CHIHUAHUA);

      return dog;
    });

    /* Print copy dog */
    copyDogs.forEach(System.out::println);
  }
}