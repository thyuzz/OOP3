package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();

        Dog dog1 = new Dog("Шарик", 5);
        Dog dog2 = new Dog("Мухтар", 4);
        Dog dog3 = new Dog("Арчи", 6);
        Dog dog4 = new Dog("Пушок", 7);
        Dog dog5 = new Dog("Рэм", 4);
        Dog dog6 = new Dog("Буч", 3);

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);
        dogs.add(dog6);

        Collections.sort(dogs);
        System.out.println(dogs);

        Comparator<Dog> compareAge = new Comparator<Dog>() {

            public int compare(Dog o1, Dog o2) {
                return o2.getAge() - o1.getAge();
            }

        };

        Collections.sort(dogs, compareAge);
        System.out.println(dogs);

        Comparator<Dog> compareName = new Comparator<Dog>() {
            public int compare(Dog o1, Dog o2){
                return o1.getName().compareTo(o2.getName());
            }
        };

        Collections.sort(dogs, compareName);
        System.out.println(dogs);
    }





    /*ListOfCats cats = new ListOfCats();
        cats.setCatList(List.of(new Cat("barsik"), new Cat("murzik")));
        System.out.println(cats.iterator().next().getName());
        */

        /*ListOfDogs dogs = new ListOfDogs();
        dogs.setDogList(List.of(
                new Dog("Шарик", 5),
                new Dog("Мухтар", 4),
                new Dog("Арчи", 6),
                new Dog("Пушок", 7),
                new Dog("Рэм", 4),
                new Dog("Буч", 3)));

        Iterator<Dog> we = dogs.iterator();
        while (we.hasNext()){
            System.out.println(we.next().getName());
        }*/
}

