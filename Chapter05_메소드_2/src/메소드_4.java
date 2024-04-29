/* 
 *     매개변수 => 지역변수와 동일 => 메소드 종료가 되면 자동으로 메모리에서 사라진다
 *  => 사용자가 보내주는 값 => 요청 => {가공 => 처리 결과값을 전송}
 *  => Call By Value (기본형)  / Call By Reference  ( 배열 / 클래스 )
 *     
 *     static void display(int a, int b)
 *                         --------------a,b 변수의 초기화
 *                 호출시에 초기화
 *                 display(10,20) ==> a=10 , b=20
 *                         -----실제 값을 보낸다
 *                         *** 순서가 틀리면 안된다   
 *                         ex) 
 *                            isLogin(String id, String pw)
 *                            => isLogin("1234","admin")  -->> 1234 는 id에 저장되고 admin은 pw에 저장됨                
 *                              
 */
//   => 입력 / 처리 / 출력 => 3개의 정수 입력 => 총점, 평균, 학점, 출력
import java.util.*;
public class 메소드_4 {
	static int scoreInput(String subject) {
		Scanner scan=new Scanner(System.in);
		System.out.print(subject+"점수 입력 : ");
		return scan.nextInt();
	}
	static int scoreTotal(int k, int e, int m) {
		return k+e+m;
	}
	static double scoreAvg(int total) {
		return total/3.0;
	}
	public static void main(String[] args) {
		int kor=scoreInput("국어");
		int eng=scoreInput("영어");
		int math=scoreInput("수학");
		System.out.println("국어 점수 : "+ kor);
		System.out.println("영어 점수 : "+ eng);
		System.out.println("수학 점수 : "+ math);
		int total=scoreTotal(kor, eng, math);
		double avg=scoreAvg(total);
		System.out.println("총점 : "+ total);
		System.out.printf("%.2f\n",avg);

	}

}
