public class SphereCalc3{
    //private keyword means these cant be accessed/changed. So that prevents problems from ex8.
    // But any method inside this class can modify them
    // This is why Java uses private fields + getters and setters
    private double radius, area, volume;

    //Constructor has same name as class

    public void setRadius( double r ){
        radius = r;
        area = 4*Math.PI*r*r;
        volume = 4*Math.PI*Math.pow(r,3)/3.0;
    }
    public double getRadius() {return radius;}
    public double getSurfaceArea() {return area;}
    public double getVolume() {return volume;}
}