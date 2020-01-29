package pokojzklimatyzacja;

public class Room {
    private double area;
    private int temperature;
    private boolean airCondition;
    private double airConditionEfficiency;
    private int temperatureLimit;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isAirCondition() {
        return airCondition;
    }

    public void setAirConditionEfficiency(double airConditionEfficiency) {
        this.airConditionEfficiency = airConditionEfficiency;
    }

    public void setAirCondition(boolean airCondition) {
        this.airCondition = airCondition;
    }

    public void setTemperatureLimit(int temperatureLimit) {
        this.temperatureLimit = temperatureLimit;
    }

    boolean lowerTemp (int timeInHour)
    {
        double temperatureDecrease = 2*airConditionEfficiency * timeInHour * temperature/area; //prosty algorytm oblizający spadek temperatury przy uwzglednieniu czasu, powierzni pokoju, temperatury  i wydajnosci klimatyzatora
        if (airCondition && temperature - temperatureDecrease > temperatureLimit) {
           temperature -= temperatureDecrease;
            return true;
        }
        else return false;
    }
}
