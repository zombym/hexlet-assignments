package exercise;

// BEGIN
public class Cottage implements Home{
    double area;
    int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return floorCount + " этажный коттедж площадью " + this.getArea() + " метров";
    }

    @Override
    public int compareTo(Home another) {
        if(another.getArea() == this.getArea()) {
            return 0;
        }
        if(another.getArea() > this.getArea()) {
            return -1;
        } else {
            return 1;
        }
    }
}
// END
