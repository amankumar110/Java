import java.util.Scanner;
public class Rectangle extends Shape{

    private final Scanner in = new Scanner(System.in);
    private float length;
    private float breath;

    public float getBreath() {
        return breath;
    }

    public float getLength() {
        return length;
    }

    @Override
    public void input() {
        System.out.println("Enter the length : ");
        length = in.nextFloat();
        System.out.println("Enter the breath : ");
        breath = in.nextFloat();
    }

    @Override
    public void compute() {

        setArea(length*breath);
    }

}
