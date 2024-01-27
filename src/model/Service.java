package model;

public class Service {
    private final ToysList toysList;
    private final ToysFabric toysFabric;

    public Service() {
        this.toysList = new ToysList();
        this.toysFabric = new ToysFabric();
    }

    public void createToy(int id, String name, double frequency) {
        toysList.addToy(toysFabric.makeToy(id, name, frequency));
    }
}
