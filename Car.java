public class Car extends PTGT {
    private String type;
    private int numberOfSeat;

    public Car() {
       type = "";
       numberOfSeat = 0;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public String getType() {
        return type;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\t  " + type + "\t " + numberOfSeat;
    }
}
