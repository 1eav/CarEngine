package Garage;

public class Car {
    private final CarType carType;
    private final int weight;

    public Car (CarType carType, int weight) {
        this.carType = carType;
        this.weight = weight;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Тип автомобиля: " + carType + "\n" +
                "Масса автомобиля: " + weight;
    }
}