/*
 *   매개변수의 전송
 *   => 메소드 안의 변수는 메소드가 종료가 되면 => 자동으로 사라진다 => 다른 메소드로 값을 전송해줘야함
 *   
 */
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;
/*
 *   메소드의 연결
 *   ---------
 *   숫자 야구게임 => 분리 하는 작업
 *   기능들)
 *      1. 3개의 중복없는 난수를 발생한다 
 *      2. 사용자로부터 3개 정수를 입력받는다 
 *      3. 난수 / 사용자 입력값 비교 
 *      4. 힌트 제공
 *      5. 종료여부 확인 ==> 다시 게임을 할것인지
 *    
 *    
 */
public class 메소드정리_04 {

	public static void main(String[] args) {
//		절차적 언어 => 다시 게임을 할지 물어보는것이 불가능 => 재사용이 안된다
//		3개의 중복없는 난수 발생
		int[] com=new int[3];
		for(int i=0; i<com.length; i++) {
			com[i]=(int)(Math.random()*9)+1; //1~9 사이 정수 => 중복없이
			// 중복체크
			for(int j=0; j<i; j++){
				if(com[i]==com[j]) {
					i--; //원상복귀 시켜서 다시추출하게 만들기
					break;
				}
			}
			
		}
//	    사용자 입력 => 정답입력이 되는 상태 까지 계속 돌아야함 => while
//		사용자 입력값 저장
		int[] user= new int[3];
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print(" 세자리 정수 입력 :");
			int input = scan.nextInt();
			//오류처리하기
			if(input< 100 || input> 999) {
				System.out.println("세자리 정수만 입력이 가능합니다");
		    // 처음상태로 돌아간다
				continue;
			}
			user[0]=input / 100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			//오류처리
			if(user[0]==user[1] || user [1]== user[2] ||user[0] == user[2]) {
				System.out.println("같은 수는 입력할 수 없습니다");
				continue;
			
			}
			if(user[0]==0 || user [1]==0 || user[2]==0) {
				System.out.println(" 0은 입력할 수 없습니다");
				continue;
			}
			//비교
			int s=0, b=0;
			for(int i=0; i<com.length; i++){
				for(int j=0; j<user.length; j++){
					// i=0 => j= 0,1,2
					// i=1 => j= 0,1,2
					// i=2 => j= 0,1,2
					if(com[i]==user[j]) {//같은 수가 있는지
						if(i==j) //같은 자리에 있는가
							s++;
						else     //다른 자리에 있는가
							b++;
					}
				}
				
			}
			//힌트
			System.out.printf("Input Number : %d, Result: %dS- %dB\n",input,s,b);
			//종료 여부 확인
			if(s==3) {
				System.out.println("Home Run@@");
				break;
				
			}
			
				
		}
		
		
	}

}
