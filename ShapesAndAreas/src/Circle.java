import java.util.Scanner;
public class Circle extends Shape {

    private final Scanner in = new Scanner(System.in);
    private float radius;

    public float getRadius() {

        return radius;
    }
    @Override
    public void input() {

        System.out.println("Enter radius : ");
        radius = in.nextFloat();
    }

    @Override
    public void compute() {
        setArea( (float) (3.14*radius*radius));
    }
}
