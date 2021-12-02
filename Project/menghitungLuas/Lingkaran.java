package menghitungLuas;

public class Lingkaran extends BangunDatar {

    public double getArea(int radius){
    	double x = Math.PI * Math.pow(radius, 2);
        return x;
    }
    public double getPerimeter(int radius){
    	double y = 2 * Math.PI * radius;
        return y; 
    }

}
