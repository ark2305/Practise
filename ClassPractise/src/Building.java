public class Building {

    private double length;
    private double breadth;
    private double area;
    private double floorArea;
    private double floors;
    private double bricks;
    private double cement;

    public double calcArea(double len, double bre){
        return len*bre;
    }

    public double calcFloorArea(double are, double flr) {
        return are*flr;
    }

    public String process(){

        return "Building in process";
    }

    public String finished(){

        return "Your building is done";
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        this.area=length*breadth;
    }

    public double getFloorArea() {
        return floorArea;
    }

    public void setFloorArea() {
        this.floorArea = area*floors;
    }

    public double getFloors() {
        return floors;
    }

    public void setFloors(double floors) {
        this.floors = floors;
    }

    public double getBricks() {
        return bricks;
    }

    public void setBricks(double bricks) {
        this.bricks = bricks;
    }

    public double getCement() {
        return cement;
    }

    public void setCement(double cement) {
        this.cement = cement;
    }
}
