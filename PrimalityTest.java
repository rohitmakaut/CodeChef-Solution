import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			if(isPrime(sc.nextInt())) System.out.println("yes");
			else System.out.println("no");
		}
	}
	static boolean isPrime(int n) {
		if(n==1) return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}
}
