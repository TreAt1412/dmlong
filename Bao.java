import java.util.Scanner;

public class Bao extends Document{
    String ngayphathanh;

    public Bao(int matailieu, int sobanphathanh, String tennhaxuatban, String ngayphathanh) {
        super(matailieu, sobanphathanh, tennhaxuatban);
        this.ngayphathanh = ngayphathanh;
    }


    public Bao(){

    }

    public void setNgayphathanh(String ngayphathanh) {
        this.ngayphathanh = ngayphathanh;
    }

    public String getNgayphathanh() {
        return ngayphathanh;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner input = new Scanner(System.in);

        this.ngayphathanh = input.next();
    }

    @Override
    public String toString() {
        return super.toString() + "\t\t  " + ngayphathanh;
    }
}
