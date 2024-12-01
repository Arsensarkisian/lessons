public class Task3 {
    public static void main(String[] args) {
        int minIndex = 0;
        int y = 0;
        int array[] = new int[10];
        array = new int[]{1, 6, 7, 3, 23, 56, 44, 33, 23, 73};
        for (int i = 0; i < array.length-1; i++) {

            minIndex = i;
            for (int index = i+1; index < array.length-1; index++) {
                if(array[index] < array[minIndex]){
                    minIndex = index;

                }
            }
            y = array[i];
            array[i] = array[minIndex];
            array[minIndex] = y;

        }
        System.out.println(array[1]);
        }
    }

