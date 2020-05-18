package ru.leverx;

import ru.leverx.entity.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final Staff staff = new Staff();
        final Vet vet = new Vet();
        final Dog[] dogs = new Dog[4];
        final Aviary aviary = new Aviary(dogs.length);
        final TrainingArea trainingArea = new TrainingArea(dogs.length);

        dogs[0] = new Dog("Flesh", true, true, false, (byte) 0, null);
        dogs[1] = new Dog("Spike", true, true, true, (byte) 4, Job.POLICE);
        dogs[2] = new Dog("Dino", true, true, true, (byte) 5, Job.EMERGENCY);
        dogs[3] = new Dog("Archie", false, true, true, (byte) 10, null);

        aviary.addAll(Arrays.asList(dogs));

        System.out.println("--------Morning--------");

        aviary.forEach(staff::feed);
        aviary.forEach(vet::examine);
        aviary.setDirty(true);

        System.out.println("--------Midday--------");

        aviary.clear();
        staff.clean(aviary);
        trainingArea.add(dogs[0]);
        trainingArea.forEach(staff::train);
        for (Dog d: dogs) {
            staff.sendToWork(d);
            d.setHungry(true);
        }
        trainingArea.clear();

        System.out.println("--------Evening--------");

        aviary.addAll(Arrays.asList(dogs));
        aviary.forEach(staff::feed);
    }
}
