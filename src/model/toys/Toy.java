package model.toys;

public abstract class Toy implements Comparable<Toy> {
    private int id;
    private Double frequency;
    private final String name;

    public String getName() {
        return name;
    }


    public Toy(int id, String name, double frequency) {
        this.id = id;
        this.frequency = frequency;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }


    @Override
    public int compareTo(Toy o) {
        return frequency.compareTo(o.getFrequency());
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", frequency=" + frequency +
                ", name='" + name + '\'' +
                '}';
    }
}
