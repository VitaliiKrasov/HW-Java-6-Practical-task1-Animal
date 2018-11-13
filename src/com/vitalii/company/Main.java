package com.vitalii.company;

/**
 * Create interface Animal with methods voice() and feed().
 * Create two classes Cat and Dog, which implement this interface.
 * Create array of Animal and add some Cats and Dogs to it.
 * Call voice() and feed() method for all of it
 */
public class Main {

    public static void main(String[] args) {
	    Animal [] arrAnimals = new Animal[5];
	    arrAnimals[0] = new Cat();
	    arrAnimals[1] = new Dog();
	    arrAnimals[2] = new Dog();
	    arrAnimals[3] = new Cat();
	    arrAnimals[4] = new Cat();

	    for (int i = 0; i < arrAnimals.length; i++) {
            arrAnimals[i].voice();
            arrAnimals[i].feed();
        }
    }
}
