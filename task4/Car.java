package task4;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car(){
        this(1960, 250, 3500, "Black");
    }

    public Car (int year){
        this (year, 249, 3400, "Red");
    }

    public Car (int year, int speed){
        this(year, speed, 3990, "Red");
    }

    public Car (int year, int speed, int weight){
        this(year, speed, weight, "White");
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
