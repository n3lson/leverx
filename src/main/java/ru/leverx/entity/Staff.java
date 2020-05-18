package ru.leverx.entity;

public class Staff {
    private enum Ration {
        FOR_PUPPIES, FOR_ADULT_DOGS, FOR_OLD_DOGS;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    public Staff() { }

    public void feed(Dog dog) {
        if (dog.isHungry()) {
            if (dog.getAge() == 0) {
                dog.eat(Ration.FOR_PUPPIES.toString());
            } else if (dog.getAge() > 0 && dog.getAge() <= 8) {
                dog.eat(Ration.FOR_ADULT_DOGS.toString());
            } else {
                dog.eat(Ration.FOR_OLD_DOGS.toString());
            }
            System.out.println("The dog " + dog.getName() + " has been fed.");
        } else {
            System.out.println("The dog " + dog.getName() + " is not hungry.");
        }
    }

    public void clean(Aviary aviary) {
        if (aviary.isDirty()) {
            aviary.setDirty(false);
            System.out.println("The aviary has been cleaned.");
        } else {
            System.out.println("The aviary does not require cleaning.");
        }
    }

    public void train(Dog dog) {
        if (dog.getAge() == 0) {
            if (dog.isTrained()) {
                System.out.println("The dog " + dog.getName() + " does not require training.");
            } else {
                dog.setTrained();
                System.out.println("The dog " + dog.getName() + " has been trained.");
            }
        }
    }

    public void sendToWork(Dog dog) {
        if (dog.getAge() < 9) {
            System.out.println("The dog " + dog.getName() + " has been sent to work.");
            dog.work();
        } else {
            System.out.println("The dog " + dog.getName() + " is old and stays in the aviary.");
        }
    }
}
