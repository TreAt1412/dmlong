public class Moto extends PTGT {
    private double power;

    public Moto(){
        power = 0;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\t\t\t\t\t " + power;
    }
}
