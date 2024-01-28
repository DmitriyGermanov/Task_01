package main;


import model.Service;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        try {
            service.createToy(1, "robot", 2.0);
            service.createToy(2, "doll", 2.0);
            service.createToy(3, "constructor", 6.0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            service.drawPrize();
        }
        try {
            service.writeAllDrawToFile("Output.json");
        } catch (RuntimeException | IOException e) {
            e.printStackTrace();
        }
    }
}