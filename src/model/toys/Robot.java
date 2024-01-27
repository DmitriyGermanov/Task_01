package model.toys;

public class Robot extends Toy {
    public Robot(int id, double frequency) {
        super(id, "robot", frequency);
    }

    @Override
    public String getName() {
        return super.getName();
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
