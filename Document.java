import java.util.Scanner;

public class Document {
    int matailieu, sobanphathanh;

    public int getMatailieu() {
        return matailieu;
    }

    public void setMatailieu(int matailieu) {
        this.matailieu = matailieu;
    }

    public int getSobanphathanh() {
        return sobanphathanh;
    }

    public void setSobanphathanh(int sobanphathanh) {
        this.sobanphathanh = sobanphathanh;
    }

    public String getTennhaxuatban() {
        return tennhaxuatban;
    }

    public void setTennhaxuatban(String tennhaxuatban) {
        this.tennhaxuatban = tennhaxuatban;
    }

    String tennhaxuatban;

    public Document(int matailieu, int sobanphathanh, String tennhaxuatban) {
        this.matailieu = matailieu;
        this.sobanphathanh = sobanphathanh;
        this.tennhaxuatban = tennhaxuatban;
    }

    public Document(){

    }

    public void nhap(){
        Scanner input = new Scanner(System.in);
        this.matailieu = input.nextInt();
        this.sobanphathanh = input.nextInt();
        this.tennhaxuatban = input.next();
    }

    @Override
    public String toString() {
        return (matailieu + "\t " + sobanphathanh + "\t " + tennhaxuatban);
    }
}
