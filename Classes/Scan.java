import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter next method's");
        String first = in.nextLine();
        

        System.out.println(first);
        in.close();
    }
}
