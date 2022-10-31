package task3;

public class Car {
    int year;
    double speed;
    int weight;
    String color;


    public Car(String color) {
        this.color = color;
        this.year = 1970;
        this.weight = 3000;
        this.speed = 300;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.color = "Blue";
        this.weight = 3200;
    }



    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "Silver";
    }

    public Car(double speed, int weight, String color) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.year = 1965;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

}
