public class Task2 {
    public static void main(String[] args) {
        int array[] = new int[10];
        array = new int[]{1, 5, 2, 8, 2, 1, 6, 4, 2, 7};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println(sum);
        System.out.println(sum / array.length);
    }
}
