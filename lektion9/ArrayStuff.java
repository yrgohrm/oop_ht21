import java.util.concurrent.ThreadLocalRandom;

public class ArrayStuff {
    public static void main(String[] args) {

        System.out.println("Det tredje argumentet är: " + args[2]);

        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void oldmain(String[] args) {
        String[] data = new String[2];
        data[0] = "Hejsan";
        //data[1] = "Hoppsan";

        for (String val : data) {
            System.out.println(val);
        }
    }


    public static void somefunc() {
        int[] data = new int[5];

        for (int i = 0; i < data.length; ++i) {
            data[i] = 99;
        }

        int[] data2 = data;

        data[0] = 0;

        for (int val : data2) {
            System.out.printf("slump är %d%n", val);
        }



        int[] source = { 1, 2, 3, 77, 99, 12};
        int[] destination = new int[4];
        destination[0] = source[0];
        destination[1] = source[2];
        destination[2] = source[4];
    }
}
