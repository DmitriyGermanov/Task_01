package model.toys;

public class Constructor extends Toy {
    @Override
    public String getName() {
        return super.getName();
    }

    public Constructor(int id, double frequency) {
        super(id, "constructor", frequency);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public int compareTo(Toy o) {
        return super.compareTo(o);
    }
}
