package pokojzklimatyzacja;

public class TestClass {
    public static void main(String[] args) {
        Room room = new Room();
        room.setArea(30);
        room.setTemperature(30);
        room.setAirCondition(true);
        room.setTemperatureLimit(20);
        room.setAirConditionEfficiency(0.8);
        System.out.println("Powierzchnia pokoju: " + room.getArea() + "m2 Temperatura: " + room.getTemperature() + "stopni Klimatyzacja: " + room.isAirCondition());
        System.out.println("Czy obniżono temperature? " + room.lowerTemp(2));
        System.out.println("Powierzchnia pokoju: " + room.getArea() + "m2 Temperatura: " + room.getTemperature() + "stopni Klimatyzacja: " + room.isAirCondition());
        room.setArea(60);
        System.out.println("Powierzchnia pokoju: " + room.getArea() + "m2 Temperatura: " + room.getTemperature() + "stopni Klimatyzacja: " + room.isAirCondition());
        System.out.println("Czy obniżono temperature? " + room.lowerTemp(2));
        System.out.println("Powierzchnia pokoju: " + room.getArea() + "m2 Temperatura: " + room.getTemperature() + "stopni Klimatyzacja: " + room.isAirCondition());
        room.setAirCondition(false);
        System.out.println("Powierzchnia pokoju: " + room.getArea() + "m2 Temperatura: " + room.getTemperature() + "stopni Klimatyzacja: " + room.isAirCondition());
        System.out.println("Czy obniżono temperature? " + room.lowerTemp(2));

    }
}
