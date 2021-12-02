package menghitungLuas;

public class Bola extends BangunRuang{

	public double getArea(int radius){
		double x = 4*Math.PI*Math.pow(radius,2);
        return x;
    }
    public double getVolume(int radius){
    	double y = (4/3)*Math.PI*Math.pow(radius,3);
        return y;
    }

}
