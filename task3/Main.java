package task3;

public class Main {
    public static void main(String[] args) {
        Car lightningMcQueen = new Car("Red");
        System.out.println("Lightning McQueen:"+ " " + lightningMcQueen.color + " " + lightningMcQueen.weight + " " + lightningMcQueen.year + " " + lightningMcQueen.speed);

        Car docHudson = new Car(1951, 172);
        System.out.println("Doc Hudson:"+ " " + docHudson.color + " " + docHudson.weight + " " + docHudson.year + " " + docHudson.speed);

        Car sallyCarrera = new Car(2002, 284, 3075);
        System.out.println("Sally Carrera:"+ " " + sallyCarrera.color + " " + sallyCarrera.weight + " " + sallyCarrera.year + " " + sallyCarrera.speed);

        Car towMater = new Car(69.0, 3250, "Rusty Blue");
        System.out.println("Tow Mater:"+ " " + towMater.color + " " + towMater.weight + " " + towMater.year + " " + towMater.speed);

        Car ramon = new Car(1951, 10, 3420, "Purple with flame");
        System.out.println("Ramon:"+ " " + ramon.color + " " + ramon.weight + " " + ramon.year + " " + ramon.speed);


    }
}
