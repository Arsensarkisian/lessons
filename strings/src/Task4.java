import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        String str1 = in.nextLine();
        System.out.println("Kакое слово нужно посчитать в предложении?");
        String str2 = in.nextLine();
        String []strings = str1.split(" ");
        for(int i = 0; i < strings.length; i++){
            if(str2.equalsIgnoreCase(strings[i])){
                counter++;
            }
        }
        System.out.println(counter);
        in.close();
    }
}
