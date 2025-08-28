import java.util.*;

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            int items;
            do { 
                System.out.println("Enter how many items you want?");
                items = sc.nextInt();
            } while (items <= 0);
            for (int i = 0; i <= items; i++) {
                    System.out.println();
                }
                int choice = sc.nextInt();
                int tot = 0;
                int qty = sc.nextInt();
                switch(choice){
                    case 1: tot += 4000 * qty;
                    case 2 : tot += 5000 * qty;
                    case 3 : 
                }
            
        }
    }
}
