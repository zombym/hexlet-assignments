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
        int cx = (start.getX() + finish.getX())/2;
        int cy = (start.getY() + finish.getY())/2;
        return new Point(cx, cy);
    }
}
// END
