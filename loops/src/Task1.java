public class Task1 {
    public static void main(String[] args) {
        String aarray[] = new String[]{"John","Bob","Mary","Peter","Sarah"};
        System.out.println("for loop");
        for(int i = 0; i < aarray.length; i++){
            int counter = 0;
            if(aarray[i].length() < 4){
                System.out.println("Ваше имя короче 4 букв");
            } else if (aarray[i].length() > 4) {
                System.out.println("Ваше имя длиннее 4 букв");
            }
            else{
                System.out.println("Ваше имя состоит из 4 букв");
            }
        }
        System.out.println();
        System.out.println("while loop");
        int i = 0;
        while (i < aarray.length){

            if(aarray[i].length() < 4){
                System.out.println("Ваше имя короче 4 букв");
            } else if (aarray[i].length() > 4) {
                System.out.println("Ваше имя длиннее 4 букв");
            }
            else{
                System.out.println("Ваше имя состоит из 4 букв");
            }
            i++;
        }
        System.out.println();
        System.out.println("do-while loop");
        int y = 0;
        do {
            if(aarray[y].length() < 4){
                System.out.println("Ваше имя короче 4 букв");
            } else if (aarray[y].length() > 4) {
                System.out.println("Ваше имя длиннее 4 букв");
            }
            else{
                System.out.println("Ваше имя состоит из 4 букв");
            }
            y++;
        }while (y < aarray.length);
    }
}
