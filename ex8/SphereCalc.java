public class SphereCalc{
    double radius;

    public void setRadius(double r){
        radius = r;
    }

    public double getRadius(){
        return radius;
    }

    public double getSurfaceArea(){
        reutrn 4*Math.PI*radius*radius;
    }

    public double getVolume(){
        return 4*Math.PI.pow(radius,3)/3.0;
    }
}