/*
 *  3) Scanner 클래스를 이용하여 한 개의 정수를 입력받아 정수의 절대값을 출력하라
 */
import java.util.Scanner;
public class 제어문문제_3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b;
		System.out.print("정수입력:");
		a=scan.nextInt();
		
		if(a>=0) {
			System.out.println("a="+a);
		}
		if(a<0) {
			System.out.println("a="+a*-1);
		}
		
	}
}
