import java.util.Scanner;
class Main {
	static boolean isPalindrome(int a) {
		int temp=a,reverse=0;
		while(a>0) {
			reverse=reverse*10+a%10;
			a=a/10;
		}
		if(temp==reverse) return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			if(isPalindrome(sc.nextInt())) System.out.println("wins");
			else System.out.println("loses");
		}
	}
}
		



