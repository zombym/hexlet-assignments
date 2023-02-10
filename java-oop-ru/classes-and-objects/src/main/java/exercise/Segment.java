package exercise;

// BEGIN
    public class Segment {
        private Point start;
        private Point finish;

    public Segment(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
    }

    public Point getBeginPoint() {
        return this.start;
    }

    public Point getEndPoint(){
        return this.finish;
    }

    public Point getMidPoint(){
        return this.finish;
    }
}
// END
