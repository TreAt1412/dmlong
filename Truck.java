public class Truck extends PTGT {
    private double load;

    public Truck(){
        load = 0;
    }
    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\t\t\t\t\t\t\t " + load;
    }
}
