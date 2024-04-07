package Garage;

public class Engine {
    private final EngineType engineType;
    private final double Volume;
    private final int Power;

    public Engine (EngineType engineType, double Volume, int Power) {
        this.engineType = engineType;
        this.Volume = Volume;
        this.Power = Power;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public double getVolume() {
        return Volume;
    }

    public int getPower() {
        return Power;
    }

    @Override
    public String toString() {
        return "Тип двигателя: " + engineType + "\n" +
                "Объём двигателя: " + Volume + "\n" +
                "Мощность двигателя: " + Power;
    }
}