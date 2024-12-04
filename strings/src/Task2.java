import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        int number = in.nextInt();
        char [] chars = str1.toCharArray();
        String newString;
        if(number > 0){
            for(int i = 0; i < chars.length; i++){
                chars[i] = (char)(chars[i] + number);
            }
        }
        else if(number < 0){
            for(int i = 0; i < chars.length; i++){
                chars[i] = (char)(chars[i] + number);
            }
        }
        else{
            System.out.println("number is 0");
        }
        newString = new String(chars);
        System.out.printf("Исходное сообщение: %s, зашифрованное сообщение: %s, шифр: %d",str1,newString,number);
        in.close();
    }
}
