package model.toys;

public class Doll extends Toy{
    @Override
    public String getName() {
        return super.getName();
    }

    public Doll(int id,  double frequency) {
        super(id, "doll", frequency);
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
