import javax.print.Doc;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Manage {
    private ArrayList<Document> list;
    public Scanner sc = new Scanner(System.in);
    public Manage (){ list = new ArrayList(); }
    public ArrayList getList() { return list; }

    public Document inputDocument(){
        Document d = new Document();
        System.out.println("Enter Ma tai lieu: ");
        d.matailieu = Integer.parseInt(sc.nextLine());
        System.out.println("Enter So ban phat hanh :");
        d.sobanphathanh = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Ten nha xuat ban : ");
        d.tennhaxuatban = sc.nextLine();
        return d;
    }
    public void inputSach(){
        Document d = inputDocument();
        Sach s = new Sach();
        System.out.println("Enter Ten tac gia:");
        s.setTentacgia(sc.nextLine());
        System.out.println("Enter Ten sach: ");
        s.setTensach(sc.nextLine());
        System.out.println("Enter So trang :");
        s.setSotrang(Integer.parseInt(sc.nextLine()));
        s.matailieu = d.matailieu;
        s.sobanphathanh = d.sobanphathanh;
        s.tennhaxuatban = d.tennhaxuatban;
        list.add(s);
    }
    public void inputTapchi() {
        Document d = inputDocument();
        Tapchi t = new Tapchi();
        System.out.println("Enter So phat hanh: ");
        t.setSophathanh(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter Thang phat hanh: ");
        t.setThangphathanh(Integer.parseInt(sc.nextLine()));
        t.matailieu = d.matailieu;
        t.sobanphathanh = d.sobanphathanh;
        t.tennhaxuatban = d.tennhaxuatban;
        list.add(t);
    }
    public void inputBao(){
        Document d = inputDocument();
        Bao b = new Bao();
        System.out.println("Enter Ngay phat hanh: ");
        b.setNgayphathanh(sc.nextLine());
        b.matailieu = d.matailieu;
        b.sobanphathanh = d.sobanphathanh;
        b.tennhaxuatban = d.tennhaxuatban;
        list.add(b);
    }
    public void disPlay(ArrayList<Document> list){
        if (list.size() == 0) System.out.println("Empty list!!");
        else{
            System.out.println("Ma tai lieu \t So ban phat hanh \t tennhaxuatban \t tentacgia \t tensach \t sotrang \t sophathanh \t thangphathanh \t ngayphathanh");
            for(Document d : list)
                System.out.println(d.toString());
            System.out.println();
        }
    }
    public void Searchbyauthor(){
        System.out.println("Enter name: ");
        String s = sc.nextLine();
        ArrayList<Document> a = new ArrayList();
        for(Document p : list){
            if(p.tennhaxuatban.toLowerCase().matches(".*"+s.toLowerCase() + ".*"))
                a.add(p);
        }
        if(a.size()==0) System.out.println("Empty List");
        else disPlay(a);
    }
    public void Searchbyrange(){
        System.out.println("Enter time begin: ");
        int s = Integer.parseInt(sc.nextLine());
        System.out.println("Enter to:");
        int e = Integer.parseInt(sc.nextLine());
        ArrayList<Document> a = new ArrayList();
        ArrayList<Bao> b = new ArrayList<>();
        for(Document d: a)
            try {
                b.add((Bao)d);
            }
            catch (Exception z){}
        for(Bao m : b){
            if(Integer.parseInt(m.getNgayphathanh()) >= s && Integer.parseInt(m.getNgayphathanh()) <= e)
                a.add(m);
        }
        if(a.size()==0) System.out.println("Empty");
        else
            disPlay(a);
    }
    public void Searchbypagenumber(){
        System.out.println("Enter number of page:");
        int s = Integer.parseInt(sc.nextLine());
        ArrayList<Document> a = new ArrayList();
        ArrayList<Sach> b = new ArrayList<>();
        for(Document d: a)
            try {
                b.add((Sach)d);
            }
            catch (Exception e){}
        for(Sach m : b){
            if(m.getSotrang() == s)
                a.add(m);
        }
        if(a.size()==0) System.out.println("Empty");
        else
            disPlay(a);
    }
    public void sortimprint() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (((Document)list.get(i)).getTennhaxuatban().compareToIgnoreCase(((Document)list.get(j)).getTennhaxuatban()) > 0) {
                    Document p = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, p);
                }
            }
        }
        disPlay(list);
    }





}
