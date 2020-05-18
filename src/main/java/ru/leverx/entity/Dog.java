package ru.leverx.entity;

public class Dog {
    private String name;
    private boolean healthy;
    private boolean hungry;
    private boolean trained;
    private byte age;
    private Job job;

    public Dog(String name, boolean healthy, boolean hungry, boolean trained, byte age, Job job) {
        this.name = name;
        this.healthy = healthy;
        this.hungry = hungry;
        this.trained = trained;
        this.age = age > -1 ? age : 0;
        this.job = job;
    }

    String getName() {
        return name;
    }

    boolean isHealthy() {
        return healthy;
    }

    void setHealthy() {
        this.healthy = true;
    }

    boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    boolean isTrained() {
        return trained;
    }

    void setTrained() {
        this.trained = true;
    }

    byte getAge() {
        return age;
    }

    void eat(String ration) {
        System.out.println("The dog " + name + " has eaten ration \"" + ration + "\".");
    }

    void work() {
        if (age > 0 && age < 9){
            System.out.println("The dog " + name + " has gone to work in " + job.toString() + ".");
        }
    }
}
