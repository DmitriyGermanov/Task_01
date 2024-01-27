package model;

import model.toys.Toy;

import java.util.PriorityQueue;
import java.util.Random;

public class PrizeDraw {
    ToysList toysList;
    PriorityQueue<Toy> toysQueue;
    Service service;
    Random rand;

    public PrizeDraw(ToysList toysList, Service service) {
        this.toysList = toysList;
        this.toysQueue = new PriorityQueue<>();
        this.service = service;
        this.rand = new Random();
    }

    public void drawPrize() {
        double[] prizeWeights = new double[toysList.getToyListLength() + 1];
        prizeWeights[0] = 0.0;
        double randomNum = rand.nextDouble() * 100;
        for (int i = 1; i < prizeWeights.length; i++) {
            prizeWeights[i] = prizeWeights[i - 1] +
                    toysList.getToyWeightByIndex(i - 1) / service.getTotalWeight() * 100;
        }
        for (int i = 0; i < prizeWeights.length; i++) {
            if (randomNum <= prizeWeights[i + 1] && randomNum >= prizeWeights[i]) {
                toysQueue.add(toysList.getToyByIndex(i));
                break;
            }
        }
    }

    public Toy getPrize() {
        Toy exitToy =  toysQueue.poll();
        toysQueue.remove(exitToy);
        return exitToy;
    }

    public PriorityQueue<Toy> getToysQueue() {
        return toysQueue;
    }
}
