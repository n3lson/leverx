package ru.leverx.entity;

public class Vet {
    private void treat(Dog dog) {
        dog.setHealthy();
        System.out.println("The dog has been treated.");
    }

    public void examine(Dog dog) {
        System.out.println("The dog " + dog.getName() + " has been examined.");
        if (dog.isHealthy()) {
            System.out.println("The dog " + dog.getName() + " does not require treatment.");
        } else {
            treat(dog);
        }
    }
}
