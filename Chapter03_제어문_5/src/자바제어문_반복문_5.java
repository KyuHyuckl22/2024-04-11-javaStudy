/*
 *    A~Z 사이에서 사용자가 입력한 알파벳이 몇번째 있는지 확인
 *    
 * 
 */
import java.util.Scanner;
public class 자바제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);		
		System.out.print("대문자를 입력하세요 : ");
		char c=scan.next().charAt(0);
		
		int i=1;  // 위치 확인
		for(char ch='A';ch<='Z';ch++)
		{
			if(c==ch)
				break; // 종료 ==> i변수를 이용해서 ~번째 확인 => index
			i++;
		}		
		System.out.println(c+"는(은) "+i+"번째 있습니다");
			
		
	}

}
