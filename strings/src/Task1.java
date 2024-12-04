import java.sql.SQLOutput;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 digits");
        int [] array = new int[5];
        for(int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                System.out.println("Число " + array[i] + " - четное");
            }
            else{
                System.out.println("Число " + array[i] + " - нечетное");
            }
        }
        in.close();
    }
}
