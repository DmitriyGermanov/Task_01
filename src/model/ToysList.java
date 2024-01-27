package model;

import model.toys.Toy;

import java.util.ArrayList;
import java.util.List;

public class ToysList {
    List<Toy> toysList;

    public ToysList() {
        this.toysList = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        this.toysList.add(toy);
    }

    public void remove(Toy toy) {
        this.toysList.remove(toy);
    }

    public void removeToyById(int id) {
        this.toysList.removeIf(t -> t.getId() == id);
    }

    public List<Toy> getToysList() {
        return this.toysList;
    }

    public void setToysList(List<Toy> toysList) {
        this.toysList = toysList;
    }

    public int getToyListLength() {
        return this.toysList.size();
    }

    public Toy getToyById(int id) {
        for (Toy toy : this.toysList) {
            if (toy.getId() == id) {
                return toy;
            }
        }
        throw new IllegalArgumentException("Игрушка с таким ID не найдена");
    }

    public double getToyWeightById(int id) {
        for (Toy toy : this.toysList) {
            if (toy.getId() == id) {
                return toy.getWeight();
            }
        }
        throw new IllegalArgumentException("Игрушка с таким ID не найдена");
    }

    public double getToyWeightByIndex(int index) {
        return this.toysList.get(index).getWeight();
    }

    public Toy getToyByIndex(int index) {
        return this.toysList.get(index);
    }
    public void changeFrequency(int id, float frequency) {
        boolean changed = false;
        for (Toy toy : this.toysList) {
            if (toy.getId() == id) {
                toy.setWeight(frequency);
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
                "toyList=" + toysList +
                '}';
    }
}
