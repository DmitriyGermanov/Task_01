package model.toys;

public class Doll extends Toy{
    @Override
    public String getName() {
        return super.getName();
    }

    public Doll(int id,  Double weight) {
        super(id, "doll", weight);
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
