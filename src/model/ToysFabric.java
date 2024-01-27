package model;

import model.toys.Constructor;
import model.toys.Doll;
import model.toys.Robot;
import model.toys.Toy;

public class ToysFabric {
    public Toy makeToy(int id, String name, double frequency) {
        return switch (name) {
            case "Constructor" -> new Constructor(id, frequency);
            case "Doll" -> new Doll(id, frequency);
            case "Robot" -> new Robot(id, frequency);
            default -> throw new RuntimeException("Такой игрушки не существует");
        };
    }
}
