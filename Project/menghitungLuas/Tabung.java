package menghitungLuas;

public class Tabung extends BangunRuang{

	public double getArea(int radius, int height){
		double x = (2*Math.PI*Math.pow(radius,2)) + (2*Math.PI*radius*height);
        return x;
    }
    public double getVolume(int radius, int height) {
    	double y = Math.PI * radius * height;
        return y;
    }

}
