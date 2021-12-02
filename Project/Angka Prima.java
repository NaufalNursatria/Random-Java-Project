import java.util.Scanner;
public class Prima {

	public Prima() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	      int i =0;
	      int num =0;
	      String  angkaPrima = "";
	      int n = 5;
	      scanner.close();
	      for (i = 1; i <= n; i++){                    
	         int counter=0;
	         for(num =i; num>=1; num--){
	        	 if(i%num==0){
	        		 counter = counter + 1;
	        	 	}
	         }
	     if (counter ==2){
	        angkaPrima = angkaPrima + i + " ";
	     }    
	      }
	      System.out.println("Angka Prima dari 1 - 5 :");
	      System.out.println(angkaPrima);
	}
}