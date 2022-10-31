package task4;

public class Main {
    public static void main(String[] args) {
        Car dodge = new Car();
        System.out.println("Dodge:" + dodge.color + " " + dodge.speed + " " + dodge.year + " " + dodge.weight);

        Car ford = new Car(2003);
        System.out.println("Ford:" + ford.color + " " + ford.speed + " " + ford.year + " " + ford.weight);

        Car toyota = new Car(2003, 260);
        System.out.println("Toyota:" + toyota.color + " " + toyota.speed + " " + toyota.year + " " + toyota.weight);

        Car subaru = new Car(2010, 300, 3700);
        System.out.println("Subaru:" + subaru.color + " " + subaru.speed + " " + subaru.year + " " + subaru.weight);

        Car optimusPrime = new Car(1300, 1000, 10000, "Red and Blue");
        System.out.println("Optimus Prime:" + optimusPrime.color + " " + optimusPrime.speed + " " + optimusPrime.year + " " + optimusPrime.weight);
    }
}
