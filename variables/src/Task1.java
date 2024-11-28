public class Task1 {
    public static void main(String[] args) {
        byte first = 2;
        short second = 5;
        int third = 5;
        long fourth = 242424;
        float fifth = 2.1f;
        double sixth = 233.242d;
        char seventh = 'd';
        boolean eight = true;
        String ninth = "fdf";
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
        System.out.println(sixth);
        System.out.println(seventh);
        System.out.println(eight);
        System.out.println(ninth);


        byte a = (byte) (first+1);
        System.out.println(a);
        long b = fourth % 10;
        System.out.println(b);
        int c = third * second;
        System.out.println(c);
        char d = (char) (seventh + 'f');
        System.out.println(d);
        String e = ninth + "hello world";
        System.out.println(e);
        double f = sixth / third;
        System.out.println(f);
        float h = fifth - 1;
        System.out.println(h);
        a++;
        c--;
        System.out.println(a);
        System.out.println(c);
    }
}
