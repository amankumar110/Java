public class Main {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.input();
        c.compute();
        System.out.println(c.getArea());

        Rectangle blackBoard = new Rectangle();
        blackBoard.input();
        blackBoard.compute();
        System.out.println(blackBoard.getArea());

    }
}