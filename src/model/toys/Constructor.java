package model.toys;

public class Constructor extends Toy {
    @Override
    public String getName() {
        return super.getName();
    }

    public Constructor(int id, Double weight) {
        super(id, "constructor", weight);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public Double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setWeight(Double weight) {
        super.setWeight(weight);
    }

    @Override
    public int compareTo(Toy o) {
        return super.compareTo(o);
    }
}
