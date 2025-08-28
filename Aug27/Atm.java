
import java.util.*;

public class Atm {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
      }
      int balance = 0;
      for(int it: a){
        if(it < 0){
            balance += it;
        }else{
            balance -= it;
        }
      }
      if(balance < 0){
        System.out.println("OverDraft!!");
      }
   }
}
