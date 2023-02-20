import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] i1 = new int[3];
        i1[0] = 1;
        i1[1] = 2;
        i1[2] = 3;

        double[] i2 = {1.57, 7.654, 9.986};

        char[] i3 = {'a', 'b', 'c', 'd', 'e', 'f'};
    }
    public static void task2() {
        int[] i1 = {1, 2, 3};
        double[] i2 = {1.57, 7.654, 9.986};
        char[] i3 = {'a', 'b', 'c', 'd', 'e', 'f'};

        for (int i = 0; i < i1.length; i++) {
            System.out.print(i1[i]);
            if (i != i1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < i2.length; i++) {
            System.out.print(i2[i]);
            if (i != i2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < i3.length; i++) {
            System.out.print(i3[i]);
            if (i != i3.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task3() {
        int[] i1 = {1, 2, 3};
        double[] i2 = {1.57, 7.654, 9.986};
        char[] i3 = {'a', 'b', 'c', 'd', 'e', 'f'};

        for (int i = i1.length - 1; i>= 0; i--) {
            System.out.print(i1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = i2.length - 1; i>= 0; i--) {
            System.out.print(i2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = i3.length - 1; i>= 0; i--) {
            System.out.print(i3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task4() {
        int[] i1 = {1, 2, 3};

        for (int i = 0; i < i1.length; i++) {
            if (i1[i] % 2 != 0) {
                i1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(i1));
    }

}