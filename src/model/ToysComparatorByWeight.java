package model;

import model.toys.Toy;

import java.util.Comparator;

public class ToysComparatorByWeight implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        return o1.getWeight().compareTo(o2.getWeight());
    }
}
