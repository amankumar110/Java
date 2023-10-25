
abstract public class Shape {

    private float area;
    abstract public void input();
    abstract public void compute();

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}


