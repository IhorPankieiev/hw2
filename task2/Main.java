package task2;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.color = "white";
        toyota.year = 1989;

        Car lexus =  new Car(2077);
        lexus.color = "black";

        Car scion = new Car(1995, "yellow");

        System.out.println("Toyota " + toyota.color + " " + toyota.year);
        System.out.println("Lexus " + lexus.color + " " + lexus.year);
        System.out.println("Scion " + scion.color + " " + scion.year);
    }
}
