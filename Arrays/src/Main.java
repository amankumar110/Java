import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Array is a collection of homologous variables.

        // How to initialize an array
        int []integerArray = new int[20];

        // Arrays are created on runtime, so we can take input from user and set the size of array
        System.out.println("Enter the length of array: ");
        int length = in.nextInt();
        int []array = new int[length];

        // arrays can be multidimensional as well which means array of arrays.

        int [][]studentMarks = new int[2][1];
         // [ [int],[int],[int] ];

        // regular and jaggered multidimensional arrays.

        // Regular arrays are those with same number of elements in the last dimension.
        int [][]arr1 = new int[5][9];
        // Note in every element of first dimension there are 9 ints

        // jaggerd arrays are those with different number of elements in the last dimension or any dimension;
        int [][]arr2 = new int[5][];

        arr2[0] = new int[5];
        arr2[1] = new int[2];

        Studens studentsManager = new Studens();
        studentsManager.setMarks();
        studentsManager.showMarks();




    }
}