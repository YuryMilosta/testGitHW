import java.util.Random;
import java.util.Scanner;

public class lesson7 {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

//        int[][] myArrayInt = new int[5][];
//        myArrayInt[0] = new int[10];
//        myArrayInt[1] = new int[15];
//        myArrayInt[2] = new int[5];
//        myArrayInt[3] = new int[28];
//
//        createArray2(8, 15);

//        studyArray2(10,10);

//        char[] emptyArr = new char[6];
//
//        for (int i = 0; i < emptyArr.length; i++) {
//            System.out.print(emptyArr[i] + " | ");
//        }

//        String[] myRealArr = {"Alex", "Olga", "Boris"};
//        String[] myRealArr = new String[3];
//        myRealArr[0] = "Alex";
//        myRealArr[1] = "Olga";
//        myRealArr[2] = "Boris";

//        int[] arrayInt = new int[5];
//        arrayInt[0] = 15;
//        arrayInt[1] = 2;
//        arrayInt[2] = 3;
//        arrayInt[3] = -10;
//        arrayInt[4] = 0;

//        System.out.println(arrayInt[3]);
//        arrayInt[3] = 99;
//        System.out.println(arrayInt[3] + arrayInt[0]);
//        System.out.print("Enter your name > ");
//        String tmp = scanner.next();
//        System.out.println("Hello " + tmp);

//        System.out.println(welcomeUser("Enter your surname", "Greetings"));

//        System.out.print("Enter value A > ");
//        int a = scanner.nextInt();
//        System.out.print("Enter value B > ");
//        int b = scanner.nextInt();
//        System.out.println("Result: " + (a + b));
//        for (int i = 0; i < 10; i++) {
//            System.out.println(random.nextInt()); //[-int;+int]
//            System.out.print(random.nextInt(100) + " | "); //[0;value)
//            System.out.print(myRandomIntegerValue(-2, 4) + " | ");
//        }


//        scanner.close();

//        System.out.println(welcomeUser("Enter your name", "Hello"));
//        greetingUser("UserName1");
//        greetingUser("Name1", "Surname1");
//        greetingUser("Name3", "Surname3", 1978);

//        for (int i = 0; i < 5; i++) {
//            printArray(createArray(10));
//        }
        int[][][][][][][][][][][][][][][][][][] bigArray = new int[10][2][5][9][82][2][][][][][][][][][][][][];

        for (int i = 0; i < bigArray.length; i++) {
            for (int j = 0; j < bigArray[i].length; j++) {
                for (int k = 0; k < bigArray[i][j].length; k++) {
                    for (int l = 0; l < bigArray[i][j][k].length; l++) {
//                        ........
                    }
                }
            }
        }
    }

//    public static void studyArray2(int size1, int size2) {
//        String[][] array = new String[size1][size2];
//
//        for (int y = 0; y < array.length; y++) {
//            for (int x = 0; x < array[y].length; x++) {
//                array[y][x] = "[" + y + ";" + x + "]";
//            }
//        }
//
//        for (int y = 0; y < array.length; y++) {
//            for (int x = 0; x < array[y].length; x++) {
//                System.out.print(array[y][x] + "\t");
//            }
//            System.out.println();
//        }
//    }

//    public static void createArray2(int upper1, int upper2) {
//        int[][] myArrayInt2 = new int[random.nextInt(upper1)][];
//
//        for (int i = 0; i < myArrayInt2.length; i++) {
//            myArrayInt2[i] = new int[random.nextInt(upper2)];
//        }
//
//        for (int i = 0; i < myArrayInt2.length; i++) {
//            for (int j = 0; j < myArrayInt2[i].length; j++) {
//                myArrayInt2[i][j] = random.nextInt(30);
//            }
//        }
//
//        for (int i = 0; i < myArrayInt2.length; i++) {
//            for (int j = 0; j < myArrayInt2[i].length; j++) {
//                System.out.print(myArrayInt2[i][j] + " | ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Result: " + myArrayInt2[1][4]);
//
//    }



//    public static int[] createArray(int upper) {
//        int[] array = new int[random.nextInt(upper)];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(30);
//        }
//
//        return array;
//    }
//
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " | ");
//        }
//        System.out.println();
//    }

//    public static int myRandomIntegerValue(int min, int max) {
//        return min + random.nextInt(max - min + 1);
//    }

//    public static void greetingUser(String username) { //overload
//        System.out.println("Welcome " + username);
//    }
//
//    public static void greetingUser(String surname, int age) { //overload
//        System.out.println("Welcome " + surname);
//    }
//
//    public static void greetingUser(int age, String surname) { //overload
//        System.out.println("Welcome " + surname);
//    }
//
//    public static void greetingUser(String username, String surname) { //overload
//        System.out.println("Welcome " + username + " " + surname);
//    }
//
//    public static void greetingUser(String username, String surname, int birthYear) { //overload
//        int currentYear = 2022;
//        System.out.println("Welcome " + username + " " + surname + ". Your age is " + (currentYear - birthYear));
//    }


//    public static String welcomeUser(String systemMessage, String welcomeMessage) {
//        System.out.print(systemMessage + " > ");
//        return welcomeMessage + " " + scanner.next();
//    }

}

