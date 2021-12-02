package menghitungLuas;

public class Kubus extends BangunRuang{

	public double getVolume(int length, int width, int height){
		double x = length*width*height;
        return x;
    }
    public double getArea(int length, int width, int height){
    	double y = 2*(length*width)+(length*height)+(width*height);
        return y;
    }

}
