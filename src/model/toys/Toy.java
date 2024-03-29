package model.toys;

public abstract class Toy implements Comparable<Toy> {
    private Integer id;
    private Double weight;
    private final String name;

    public String getName() {
        return name;
    }


    public Toy(int id, String name, double weight) {
        this.id = id;
        this.weight = weight;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Double getWeight() {
        return weight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }


    @Override
    public int compareTo(Toy o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
