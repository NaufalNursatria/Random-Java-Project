public class Fibonacci {

	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10, t1 = 0, t2 = 1;
        System.out.print("Angka Fibonacci 1 - 10 :");
        
        for (int i = 1; i <= n; ++i){
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
	}
}