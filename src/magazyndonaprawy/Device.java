package magazyndonaprawy;

import java.io.PrintStream;

public class Device {
    String code;
    String producer;
    String type;
    double price;

    public Device(String code, String producer, String type, double price) {
        this (code, producer, type);
        this.price = price;
    }

    public Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }
    PrintStream getInfo()
    {
       return System.out.printf("Kod: %s, producent: %s, typ: %s, cena: %1.2f\n", code, producer, type, price);
    }
}
