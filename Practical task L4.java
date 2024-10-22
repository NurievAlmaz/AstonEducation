public class Main {

    public static void main(String args[]) {
        // writeThreeWords();
        //   checkSumSign();
         // printcolor();
        //   compareNumbers();
        //   method1();
        //   method2();
        //   method3();
        //method4();
        //method5();
        // method6();
        // method7();
        //method8();
        //method9();
        //method10();


    }

    // Задание 1
    static void writeThreeWords() {

        System.out.println("Orange\nBanana\nApple");
    }

    // Задание 2
    static void checkSumSign() {

        int a = 0, c = -4;
        if (a + c >= 0) {
            System.out.print("Число положительное");
        } else {
            System.out.print("Число отрицательное");
        }
    }

    // Задание 3
    static void printcolor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("\nКрасный");
        } else if (value <= 100) {
            System.out.println("\nЖелтый");
        } else {
            System.out.println("\nЗеленый");

        }
    }

    //Задание 4
    static void compareNumbers() {
        int a = 4, b = 6;
        if (a >= b) {
            System.out.print("(a >= b)");
        } else {
            System.out.print("(a < b)");
        }
    }

    //Задание 5
    static boolean method1() {
        int a = 0, b = 6;
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 6
    static void method2() {
        int x = 5;
        if (x >= 0)
            System.out.println("\nЧисло положительное");
        else
            System.out.println("\nЧисло отрицательное");
    }

    //Задание 7
    static boolean method3() {
        int a = -1;
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    //Задание 8
    static void method4() {
        int a = 11;
        String v = "\nЧто-что про что-что";
        System.out.println("v :" + v.repeat(a));
    }

    //Задание 9
    static boolean method5() {
        int year = 100;
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }

    //Задание 10
    static void method6() {
        int[] arr = new int[]{0, 1, 0, 1, 0, 1, 0, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //Задание 11
    static void method7() {
        int[] arr = new int[100];

        for (int i = 0, j = 0; i < arr.length; i++, j += 1) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }

    //Задание 12
    static void method8() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }

    //Задание 13
    static void method9() {
        int a = 5;
        int twoD[][] = new int[a][a];

        for (int i = 0; i < a; i++) {
            twoD[i][i] = 1;
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++)
                System.out.printf("%3d", twoD[i][j]);
            System.out.println();
        }
    }

    //Задание 14
    static int[] method10(int len, int initialValue) {

        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        
        }
        return arr;
    }
}









