import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manage m = new Manage();
        Scanner sc = new Scanner(System.in);
        int k;
        do {
            System.out.println("0: Quit");
            System.out.println("1: Enter PTGT");
            System.out.println("2: Display data in list");
            System.out.println("3: Search by title");
            System.out.println("4: Search by range");
            System.out.println("5: Sort");
            System.out.println("6: Caculate by cost of model");
            System.out.println("7: Write file text");
            System.out.println("8: Read file text");
            System.out.println("9: Write file object");
            System.out.println("10: Read file object");
            System.out.println("----------------------------------------------");
            k = Integer.parseInt(sc.nextLine());
            switch (k) {
                case 0:
                    System.out.println("Bye!");
                    break;
                case 1:
                    int k1;
                    do {
                        System.out.println("0: Back");
                        System.out.println("1: Enter Car");
                        System.out.println("2: Enter Moto");
                        System.out.println("3: Enter Truck");
                        System.out.println("---------------------------");
                        k1 = Integer.parseInt(sc.nextLine());
                        switch (k1) {
                            case 0:
                                break;
                            case 1:
                                m.inputCar();
                                break;
                            case 2:
                                m.inputMoto();
                                break;
                            case 3:
                                m.inputTruck();
                                break;
                            default:
                                System.out.println("Enter from 0 to 3");
                        }
                    } while (k1!=0);

                    break;
                case 2:
                    m.disPlay(m.getList());
                    break;
                case 3:
                    int k3;
                    do {
                        System.out.println("0: Back");
                        System.out.println("1: Search by model");
                        System.out.println("2: Search by load");
                        System.out.println("---------------------------");
                        k3 = Integer.parseInt(sc.nextLine());
                        switch (k3) {
                            case 0:
                                break;
                            case 1:
                                m.searchByModel();
                                break;
                            case 2:
                                m.searchByLoad();
                                break;
                            default:
                                System.out.println("Enter from 0 to 2");
                        }
                    }while(k3!=0);
                    break;
                case 4:
                    int k4;
                    do {
                        System.out.println("0: Back");
                        System.out.println("1: Search by range of year");
                        System.out.println("2: Search by range of cost");
                        System.out.println("---------------------------");
                        k4 = Integer.parseInt(sc.nextLine());
                        switch (k4) {
                            case 0:
                                break;
                            case 1:
                                m.searchByRangeOfYear();
                                break;
                            case 2:
                                m.searchByRangeOfCost();
                                break;
                            default:
                                System.out.println("Enter from 0 to 2");
                        }
                    }while(k4!=0);
                    break;
                case 5:
                    int k5;
                    do {
                        System.out.println("0: Back");
                        System.out.println("1: Sort by model");
                        System.out.println("2: Sort by cost");
                        System.out.println("---------------------------");
                        k5 = Integer.parseInt(sc.nextLine());
                        switch (k5) {
                            case 0: break;
                            case 1:
                                m.sortByModel();
                                break;
                            case 2:
                                m.sortByCost();
                                break;
                            default:
                                System.out.println("Enter from 0 to 2");
                        }
                    }while(k5!=0);
                    break;
                case 6:
                    m.sumCostOfModel();
                    break;

                case 7:
                    m.writeFileText();
                    break;
                case 8:
                    m.readFileText();
                    break;
                case 9:
                    m.writeFileObject();
                    break;
                case 10:
                    m.readFileObject();
                    break;
            }
        } while (k!=0);

    }

}
