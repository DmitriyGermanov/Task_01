package model;

import model.toys.Constructor;
import model.toys.Doll;
import model.toys.Robot;
import model.toys.Toy;

public class ToysFabric {
    public Toy makeToy(int id, String name, double frequency) {
        return switch (name) {
            case "constructor" -> new Constructor(id, frequency);
            case "doll" -> new Doll(id, frequency);
            case "robot" -> new Robot(id, frequency);
            default -> throw new RuntimeException("Такой игрушки не существует");
        };
    }
}
