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
