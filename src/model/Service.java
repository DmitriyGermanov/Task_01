package model;

import model.file_handler.FileHandler;
import model.file_handler.Writable;

import java.io.IOException;

public class Service {
    private final ToysList toysList;
    private final ToysFabric toysFabric;
    private double totalWeight;
    private final PrizeDraw prizeDraw;
    private Writable fileHandler;


    public Service() {
        this.toysList = new ToysList();
        this.toysFabric = new ToysFabric();
        totalWeight = 0;
        prizeDraw = new PrizeDraw(toysList, this);
        fileHandler = new FileHandler();
    }

    public void createToy(int id, String name, double weight) {
        toysList.addToy(toysFabric.makeToy(id, name, weight));
        totalWeight += weight;
    }

    public void removeToy(int id) {
        totalWeight -= toysList.getToyById(id).getWeight();
        toysList.removeToyById(id);
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void drawPrize() {
        prizeDraw.drawPrize();
    }

    public void writeAllDrawToFile(String fileName) throws IOException {
        StringBuilder sb = new StringBuilder();
        while(prizeDraw.getPrizeQueueSize() > 0) {
            sb.append(prizeDraw.getPrize()).append(";");
            sb.append("\n");
        }
        fileHandler.writeObject(sb.toString(), "Output.json");
    }

    public void writeDrawToFile(String fileName) throws IOException {
        StringBuilder sb = new StringBuilder();
            sb.append(prizeDraw.getPrize()).append(";");
            sb.append("\n");
        fileHandler.writeObject(sb.toString(), "Output.json");
    }

    public void writeToFile(String message) throws IOException {
        fileHandler.writeObject(message, "Output.txt");
    }
}
