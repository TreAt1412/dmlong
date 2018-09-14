import java.util.Scanner;
public class main {
    public static void main(String[] args) {
         Manage m = new Manage();
         Scanner input = new Scanner(System.in);
         int k;
         do{
             System.out.println("0: Quit");
             System.out.println("1: Enter Document");
             System.out.println("2: Display data in list");
             System.out.println("3: Search by author");
             System.out.println("4: Search by range");
             System.out.println("5: Search by page number");
             System.out.println("6: Sort by imprint");
             System.out.println("7: Calculate");
             System.out.println("----------------------------------------------");
             k = Integer.parseInt(input.nextLine());
             switch (k){
                 case 0:
                     System.out.println("Bye!");
                     break;
                 case 1:
                     int k1;
                     do{
                         System.out.println("0: Back");
                         System.out.println("1: Enter Sach");
                         System.out.println("2: Enter Tap chi");
                         System.out.println("3: Enter Bao");
                         System.out.println("---------------------------");
                         k1 = Integer.parseInt(input.nextLine());
                         switch (k1) {
                             case 0:
                                 break;
                             case 1:
                                 m.inputSach();
                                 break;
                             case 2:
                                 m.inputTapchi();
                                 break;
                             case 3:
                                 m.inputBao();
                                 break;
                             default:
                                 System.out.println("Enter from 0 to 3");
                         }
                     }while(k1!=0);

                     break;
                 case 2:
                     m.disPlay(m.getList());
                     break;
                 case 3:
                     m.Searchbyauthor();
                     break;
                 case 4:
                     m.Searchbyrange();
                     break;
                 case 5:
                     m.Searchbypagenumber();
                     break;
                 case 6:
                     m.sortimprint();
                     break;
                 case 7:
                     System.out.println("COMING SOON!!!!!!!!!!!!!!!!!!!!");
                     break;
             }
         }while(k!=0);
    }
}
