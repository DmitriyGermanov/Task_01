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
    public double getFrequency() {
        return super.getFrequency();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setFrequency(double frequency) {
        super.setFrequency(frequency);
    }

    @Override
    public int compareTo(Toy o) {
        return super.compareTo(o);
    }
}
