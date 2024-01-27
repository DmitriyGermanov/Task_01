package model;

import model.toys.Toy;

import java.util.ArrayList;
import java.util.List;

public class ToysList {
    List<Toy> toyList;

    public ToysList() {
        this.toyList = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        this.toyList.add(toy);
    }

    public void remove(Toy toy) {
        this.toyList.remove(toy);
    }

    public List<Toy> getToyList() {
        return this.toyList;
    }

    public void setToyList(List<Toy> toyList) {
        this.toyList = toyList;
    }

    public void changeFrequency(int id, float frequency) {
        boolean changed = false;
        for (Toy toy : this.toyList) {
            if (toy.getId() == id) {
                toy.setFrequency(frequency);
                changed = true;
            }
        }
        if (!changed) {
            throw new IllegalArgumentException("Toy with id " + id + " not found");
        }
    }

    @Override
    public String toString() {
        return "ToyList{" +
                "toyList=" + toyList +
                '}';
    }
}
