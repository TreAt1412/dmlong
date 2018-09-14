public class Tapchi extends Document{
    int sophathanh, thangphathanh;

    public Tapchi(int matailieu, int sobanphathanh, String tennhaxuatban, int sophathanh, int thangphathanh) {
        super(matailieu, sobanphathanh, tennhaxuatban);
        this.sophathanh = sophathanh;
        this.thangphathanh = thangphathanh;
    }

    public int getSophathanh() {
        return sophathanh;
    }

    public int getThangphathanh() {
        return thangphathanh;
    }

    public void setThangphathanh(int thangphathanh) {
        this.thangphathanh = thangphathanh;
    }

    public void setSophathanh(int sophathanh) {
        this.sophathanh = sophathanh;
    }
    public Tapchi() {}
    @Override
    public String toString() {
        return super.toString()+ "\t\t  " + sophathanh + "\t " + thangphathanh;
    }
}
