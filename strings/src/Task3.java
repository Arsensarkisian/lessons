import java.util.Locale;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine().toLowerCase();
        boolean last = false;
        for(int i = 0, j = str1.length() - 1; i < str1.length() && i!=j; i++,j--){
            if(str1.charAt(i) == str1.charAt(j)){
                last = true;
            }
            else {
                last = false;
                System.out.println("Cтрока не является палиндромом");
                return;
            }
        }
        if(last){
            System.out.println("Cтрока  является палиндромом");
        }
        in.close();
    }
}
