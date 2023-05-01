public class SquareRootFinder {
    double n;
    int iterations;

    public void setNumber( double number){
        n = number;
        iterations = 8;
        if ( n < 7 )
            iterations++;
    }

    public double getRoot(){
        double x = n/4;
        for ( int i = 0; i<iterations; i++){
            x = (x+(n/x))/2.0;
        }
        return x;
    }
}