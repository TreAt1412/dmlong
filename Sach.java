public class Sach extends Document{
        String tentacgia, tensach;
        int sotrang;

    public Sach(int matailieu, int sobanphathanh, String tennhaxuatban, String tentacgia, String tensach, int sotrang) {
        super(matailieu, sobanphathanh, tennhaxuatban);
        this.tentacgia = tentacgia;
        this.tensach = tensach;
        this.sotrang = sotrang;
    }
    public Sach(){

    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\t  " + tentacgia + "\t " + tensach+ " \t"+ sotrang;
    }
}
