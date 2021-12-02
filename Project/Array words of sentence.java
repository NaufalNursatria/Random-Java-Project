public class splitting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String kalimat = "Universitas Bina Nusantara";
        String[] kata = kalimat.split(" ");
        System.out.println(kalimat);
        System.out.println("Jumlah kata dalam kalimat: "+kata.length);
	}
}