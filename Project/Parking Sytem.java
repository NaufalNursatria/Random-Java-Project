import java.util.Scanner;
public class parkir {

	public parkir() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String jenisKendaraan, jamMasuk, jamKeluar;
        int jam, menit;
        double harga= 0, durasi;
        System.out.print("Masukkan jenis kendaraan (Motor/Mobil): ");
        jenisKendaraan = scan.next();
        System.out.print("Jam Masuk kendaraan (HH.MM): ");
        jamMasuk = scan.next();
        System.out.print("Jam Keluar Kendaraan (HH.MM): ");
        jamKeluar = scan.next();

        jam = Integer.parseInt((jamKeluar.substring(0,2))) - Integer.parseInt((jamMasuk.substring(0,2)));
        menit = Integer.parseInt((jamKeluar.substring(3,5))) - Integer.parseInt((jamMasuk.substring(3,5)));

        durasi = (jam*60)+ menit;

        if (jenisKendaraan.equals("Motor")){
            harga = 3000 + Math.ceil((durasi-60)/60)*4000;
        }
        else if (jenisKendaraan.equals("Mobil")){
            harga = 5000 + Math.ceil((durasi-60)/60)*6000;
        }
        System.out.println("Jenis Kendaraan: " + jenisKendaraan);
        System.out.println("Jam Masuk: " + jamMasuk);
        System.out.println("Jam Keluar: " + jamKeluar);
        System.out.print("Tagihan: Rp" + harga);
	}
}