package exercise;

// BEGIN
public class Flat implements Home{
    double area;
    double balconyArea;
    int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return area + balconyArea;
    }

    @Override
    public String toString() {
        return "Квартира площадью " + this.getArea() + " метров на " + this.floor + " этаже";
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
