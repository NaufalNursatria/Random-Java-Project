package menghitungLuas;

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Persegi rec = new Persegi();
        System.out.println("Contoh Persegi Panjang");
        System.out.println("Luas = " + rec.getArea(10,5));
        System.out.println("Keliling = " + rec.getPerimeter(10,5));
        System.out.println("\n");
        
        Segitiga t = new Segitiga();
        System.out.println("Contoh Luas Segitiga");
        System.out.println("Luas = " + t.getArea(2,3));
        System.out.println("Contoh Keliling Segitiga");
        System.out.println("Keliling = " + t.getPerimeter(2,3,4));
        System.out.println("\n");
        
        Lingkaran c = new Lingkaran();
        System.out.println("Contoh Lingkaran");
        System.out.println("Luas = " + Math.round(c.getArea(10)));
        System.out.println("Keliling = " + Math.round(c.getPerimeter(10)));
        System.out.println("\n");
                
        Tabung cy = new Tabung();
        System.out.println("Contoh Tabung");
        System.out.println("Volume = " + Math.round(cy.getVolume(10,20)));
        System.out.println("Luas Permukaan = "+ Math.round(cy.getArea(10,20)));
        System.out.println("\n");
        
        Bola sph = new Bola();
        System.out.println("Contoh Bola");
        System.out.println("Volume = " + Math.round(sph.getVolume(10)));
        System.out.println("Luas Permukaan = "+ Math.round(sph.getArea(10)));
        System.out.println("\n");
        
        Kubus cb = new Kubus();
        System.out.println("Contoh Kubus");
        System.out.println("Volume = " + cb.getVolume(5,10,5));
        System.out.println("Luas Permukaan = "+ cb.getArea(5,10,5));
        
	}

}
