import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
    private ArrayList<PT> list;
    public Scanner sc = new Scanner(System.in);

    public Manage(){
        list = new ArrayList();
    }

    public ArrayList getList() {
        return list;
    }

    public PTGT inputPTGT(){
        PTGT p = new PTGT();
        System.out.print("Enter model = ");
        p.model = sc.nextLine();
        System.out.print("Enter color = ");
        p.color = sc.nextLine();
        String reg = "(((0[1-9])|([12][0-9])|3[01])/((0[1-9])|(1[012]))/(\\d{4}))";
        System.out.println("Nhap nam sx(mm/dd/yyyy): ");
        do {
            p.year = sc.nextLine();
            if (!p.year.matches(reg)) {
                System.out.println("Something wrong!!(dd/mm/yyyy)");
            }
        } while (!p.year.matches(reg));
        System.out.print("Enter cost = ");
        p.cost = Integer.parseInt(sc.nextLine());
        return p;
    }

    public void inputCar(){
        PTGT p = inputPTGT();
        Car c = new Car();
        System.out.print("Enter type = ");
        c.setType(sc.nextLine());
        System.out.print("Enter number of seat = ");
        c.setNumberOfSeat(Integer.parseInt(sc.nextLine()));
        c.color = p.color;
        c.cost = p.cost;
        c.model = p.model;
        c.year = p.year;
        list.add(c);
    }

    public void inputMoto(){
        PTGT p = inputPTGT();
        Moto m = new Moto();
        System.out.print("Enter power = ");
        m.setPower(Double.parseDouble(sc.nextLine()));
        m.color = p.color;
        m.cost = p.cost;
        m.model = p.model;
        m.year = p.year;
        list.add(m);
    }

    public void inputTruck(){
        PTGT p = inputPTGT();
        Truck t = new Truck();
        System.out.print("Enter load = ");
        t.setLoad(Double.parseDouble(sc.nextLine()));
        t.color = p.color;
        t.cost = p.cost;
        t.model = p.model;
        t.year = p.year;
        list.add(t);
    }

    public void disPlay(ArrayList<PT> list) {
        if (list.size() == 0) System.out.println("Empty List");
        else {
            System.out.println("Model\t Color\t Cost\t Year\t\t\tType\tSeat\tPower\tLoad");
            for (PT p : list) {
                System.out.println(p.toString());
            }
            System.out.println();
        }
    }

    public void searchByModel(){
        System.out.println("Enter string = ");
        String s = sc.nextLine();
        ArrayList<PT> a = new ArrayList();
        for(PT p: list){
            if(((PTGT)p).model.toLowerCase().matches(".*"+s.toLowerCase() + ".*")){
                a.add(p);
            }
        }
        if(a.size()==0) System.out.println("Empty List");
        else disPlay(a);
    }

    public void searchByLoad(){
        System.out.println("Enter load = ");
        double load = Double.parseDouble(sc.nextLine());
        ArrayList<PT> a = new ArrayList();
        ArrayList<Truck> list1 = new ArrayList<>();
        for (PT p : list) {
            try {
                list1.add((Truck) p);
            } catch (Exception e) {
                System.out.println("Got an exception");
            }
        }
        for(Truck t: list1){
            if(t.getLoad() == load){
                a.add(t);
            }
        }
        if(a.size()==0) System.out.println("Empty List");
        else disPlay(a);
    }

    public void searchByRangeOfYear(){
        System.out.println("Enter from year = ");
        int from = Integer.parseInt(sc.nextLine());
        System.out.println("Enter to year = ");
        int to = Integer.parseInt(sc.nextLine());
        ArrayList<PT> a = new ArrayList();
        for(PT p: list){
            int year = Integer.parseInt(((PTGT)p).year.substring(6,10));
            if(year >= from && year <=to){
                a.add(p);
            }
        }
        if(a.size()==0) System.out.println("Empty List");
        else disPlay(a);
    }

    public void searchByRangeOfCost(){
        System.out.println("Enter from cost = ");
        int from = Integer.parseInt(sc.nextLine());
        System.out.println("Enter to cost = ");
        int to = Integer.parseInt(sc.nextLine());
        ArrayList<PT> a = new ArrayList();
        for(PT p: list){
            int cost = ((PTGT)p).cost;
            if(cost >= from && cost <=to){
                a.add(p);
            }
        }
        if(a.size()==0) System.out.println("Empty List");
        else disPlay(a);
    }

    public void sortByModel() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (((PTGT)list.get(i)).model.compareToIgnoreCase(((PTGT)list.get(j)).model) > 0) {
                    PT p = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, p);
                }
            }
        }
        disPlay(list);
    }

    public void sortByCost() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (((PTGT)list.get(i)).cost > ((PTGT)list.get(j)).cost) {
                    PT p = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, p);
                }
            }
        }
        disPlay(list);
    }

    public void sumCostOfModel(){
        System.out.println("Enter model = ");
        String s = sc.nextLine();
        int sum = 0;
        for(PT p: list){
            if(((PTGT)p).model.toLowerCase().matches(".*"+s.toLowerCase() + ".*")){
                sum += ((PTGT) p).cost;
            }
        }
        System.out.println("Sum = " +  sum);
    }

    public void writeFileText(){
        try(PrintWriter pr = new PrintWriter("Data.txt")){
            for(PT p: list){
                pr.println(p.toString());
            }
            System.out.println("Write to file text success");
        } catch (IOException e){
            System.out.println("Got an exception");
        }
    }
    public void readFileText(){
        try(Scanner read = new Scanner(new File("Data.txt"))){
            while(read.hasNext()){
                System.out.println(read.nextLine());
            }
            System.out.println("Read to file text success");
        } catch (IOException e){
            System.out.println("Got an exception");
        }
    }

    public void writeFileObject(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(("Data.dat")))) {
            oos.writeObject(list);
            System.out.println("Write file obj success");
        } catch (FileNotFoundException e) {
            System.out.println("Got an file not found");
        } catch (IOException e) {
            System.out.println("Got an exception ");
        }
    }

    public void readFileObject(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(("Data.dat")))) {
            list = (ArrayList<PT>) ois.readObject();
            disPlay(list);
            System.out.println("Read file obj success");
        } catch (FileNotFoundException e) {
            System.out.println("Got an file not found");
        } catch (IOException e) {
            System.out.println("Got an exception ");
        } catch (ClassNotFoundException e) {
            System.out.println("Got an Class not found");
        }
    }

}
