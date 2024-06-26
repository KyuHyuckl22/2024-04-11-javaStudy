/*
 * 	1. 변수 선언 (25page)
 * 		1) 변수 : 한개의 데이터를 저장하는 메모리 공간 이름
 * 									------- 주소로 되어있음
 * 				=>데이터 변경이 가능
 * 		2) 상수 : 한개의 데이터를 저장하는 메모리 공간 이름
 * 				=> 데이터 변경이 불가능
 * 				=> 변수와 상수의 구분은 final
 * 				   ----  ---> final 데이터형 상수명=값(고정) *변경 불가
 * 				    |
 * 				데이터형 변수명 = 값 *변경 가능
 * 		3) 리터럴 : 실제 저장된 값(메모리)
 *  2. 변수 명칭법 (26page) => 식별자 => 같은 곳에서 같은 이름의 변수는 사용이 불가능하다
 *  	=> 알파벳 , 한글로 시작  
 *  	 대소문자 구분
 *  	 int 국어, 영어, 수학
 *  	 int Kor, kor, eng, math
 *  	=> 숫자사용 가능하지만 맨 앞에는 사용할 수 없다.
 *  	 int kor1, kor2, kor3 ...
 *  	=> 키워드는 사용할 수 없다
 *  	 int, byte, long , char , boolean ...
 *  	=> 공백이 들어갈 수 없다
 *  	 int a b = 1;  << 오류
 *  	=> 특수문자 사용이 가능 
 *  	 _ , $  -> 위치는 상관 없다
 *  	 _가 앞에 있는 경우는 임시변수 -> _temp => 정렬 할때 주로사용
 *  	=> 클래스, 변수, 상수, 메소드, 인터페이스, 추상클래스, 배열 ...;
 *  
 *  3. 데이터형 (타입), 기본형 (30page)
 * 	   형식)
 * 		데이터타입 변수명;
 * 		------정수, 실수, 문자, 논리
 * 		--------------------------------
 * 
 *		정수형 :  byte => 1byte (사용하는 범위 -128 ~ 127) 사용처 : 파일읽기, 업로드, 다운로드, 네트워크 통신
 *				srhort (잘 사용하지 않음)
 *				int  => 4 byte (사용하는 범위 -21억4천 ~ 21억4천)(가장 많이 사용되는 정수형.드폴트) 사용처 : 모든 프로그램의 정수형이 필요한 경우
 *				long => 8 byte (사용하는 범위 2^63 )(데이터 수집 => long형 으로 라이브러리가 제작) 사용처 : 영화댓글, 금융권/증권 
 *			bit ,  byte ->
 *           |
 *		0이나 1만 저장하는 공간 8bit => 1byte
 * 		--------------------------------
 * 		|음/양|  |  |  |  |  |  |  |
 * 		 1(음)
 * 		 0(양)
 * 		--------------------------------
 *		11111111  -128
 *		01111111   127
 * 		-------------------------------- 
 * 		01111111 을 양수로 바꾸기		
 * 		1) Change
 * 		   0->1
 * 		   1->0
 * 		10000001
 * 		-------------------------------- 		
 * 		논리형 : boolean =>true, false (조건이 있는 경우에 주로 사용) 사용처 : 로그인 , 검색어 ... 페이지
 * 			   boolean =>변수 설정
 * 						bLogin
 * 						bCheck ... (앞쪽에b가 붙음)
 *      	   1byte (0=false, 1=true)
 *      		사용법 
 *      		boolean bChak=false
 * 		--------------------------------
 * 		문자형 : char 2byte (0~65535)
 * 			   문자는 양수로만 되어있다
 * 			   =>표현하는 문자가 많이 있다.
 * 			   => Unicode : 각국의 언어를 사용할 수 있다
 * 			   => char는 문자 한개만 저장이 가능 =>''
 * 				  =>여러개 저장 => "" => char(x) => char배열 => String
 * 			   => char은 저장시에 해당 번호로 변경해서 저장
 * 					'A' => 65  <<ASC 코드값
 * 					'a' => 97  
 *					'0' => 48 
 *			    => 사용법 31page
 *			       char fname = '홍';
 *			       char alpha = 'A';
 *			    => char는 연산시에 정수형으로 변경된다 
 *					'A'+1 => 66
 *					"A"+1 => A1
 *			**** 정수 표현법
 *				10 , 20 => 10진법
 *				010 => 8진법 (앞에 0이 붙어있을 경우 8진법)
 *				0x11 => 16진법 (x가 붙어있으면 16진법)
 *				0b100 => 2진법 (b가 붙어있으면 2진법)
 * 		--------------------------------
 *		실수형 :  float => 4byte => 소수점 6자리
 *				double => 8byte => 소수점 15자리
 *				double => 실수형의 default  
 *				10.5 => double 
 *				10.5F(f) => float 
 * 		--------------------------------
 * 		참조형 : 데이터를 여러개 한번에 저장하는 방법
 * 				배열/클래스
 * 		--------------------------------
 *  4. 각 데이터형별 사용법 
 *  5. 연산처리 => 제어
 */
public class 변수_2 {
	
	public static void main(String[] args) {
		System.out.println(~127);
		//~는 음수로 바꿔서 표현해주는 연산자
		System.out.println('A'+'B');
		System.out.println("A"+"B\n");
		System.out.println((int)'A'); //65
		System.out.println((int)'a'); //97
		System.out.println((int)'0'); //48
		System.out.println((int)'+'); //43
		System.out.println('A'+'+'); //108
		System.out.println(1010); //1010
		System.out.println(0b1010); //10
		System.out.println(01010); //520
		System.out.println(8*8*8+8); //520
		System.out.println(0x1010); // 4112   =>   16^3 + 16^1
		System.out.println(16*16*16+16); // 4112

		float f = 10.5F; 
		double d = 10.5D; // D 생략 가능 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
