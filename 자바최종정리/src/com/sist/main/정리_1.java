package com.sist.main;

/*
 *        protected : 같은 패키지 => 다른 클래스까지 사용 가능
 *                상속이 있는 경우 => 다른 패키지까지 접근 가능.
 *    --------------------------------------------------------
 *       public   : 모든 클래스에서 사용이 가능하다.
 *    ---------------------------------------------------------
 *       1) class 선언
 *          [접근 지정어] class ClassName      => public    ==> 다른 클래스와 연동
 *          [접근 지정어] 데이터형 변수명         => 데이터 보호   ==> private
 *          [접근 지정어] 생성자()            => public ==> 다른 클래스와 연동
 *          [접근 지정어] 리턴형 메서드명()      => public ==> 다른 클래스와 통신
 *          [접근 지정어] interface 인터페이스명   => public ==> 다른 클래스에서 구현 후 사용
 *       => private / public
 * 
 *    => 제어어   
 *      static     : 공통적인 => 모든 객체가 공통으로 사용
 *      abstract : 미완성된 => 상속을 내려서 구현한 클래스를 이용한다.
 *      final    : 마지막     => 클래스 (종단 = 상속을 내릴 수 없는 클래스)
 *                    => 메서드 (종단 = 오버라이딩이 불가능)
 *                    => 변수 (상수 - 값을 변경할 수 있다)
 *    class ClassName {
 * 
 * 
 * 		---------------------------------- 놓친부분 -----------------------------------------
 * 
 *      -----------------------------------------------------------------------------------
 *      
 *      => static 메소드 / static 블록에서는 인스턴스를 사용할 수 없다
 *          -> 인스턴스를 사용하기 위해서는 반드시 메모리 할당이 필요하다
 *          ----------------------------------------------- 매개변수 
 *          -> 인스턴스 메소드 나 인스턴스 블록이 있을경우에는 => 인스턴스변수, static 변수 사용이 가능하다
 *          
 *      ex) 
 *          class A
 *          {
 *              int a;
 *              public static void display() {
 *                  a=200;            // 오류
 *                  A aa=new A();     // 메모리 할당 후 
 *                  aa.a=200;         // 사용
 *              }
 *          }
 *          
 *          A aa=new A();
 *          aa.a=100;
 *          
 *                 오버로딩                     오버라이딩   ☆☆☆☆☆☆☆ 꼭 기억해두기
 *     ======================================================
 *     메소드명       동일                         동일
 *     ======================================================
 *     리턴형        관계없음                       동일
 *     ======================================================
 *     매개변수     갯수 / 데이터형이 다르다            동일
 *     ======================================================
 *     접근지정어    관계 없다                     확장만 가능
 *     ======================================================
 *     상태      같은 클래스 내                     상속
 *                                            => 포함 => 익명의 클래스
 *     ======================================================     
 *     ======================================================     
 *    
 *     
 *     
 *     ======================================================
 *            미완성된 클래스 => 반드시 상속을 내려서 구현후에 사용
 *            ----------
 *                => 공통적인 기능 설계 => 표춘화 시 주로 사용
 *                => 서로 다른 클래스 연결(리모콘)
 *                => 관련된 클래스를 여러개 묶어서 사용
 *                => 결합성이 낮은 프로그램 제작이 가능하다
 *                
 *                
 *              추상 클래스                   인터페이스     
 *     ======================================================
 *      상속     단일 상속                     다중 상속 => 추상클래스의 단점을 보완
 *     ======================================================     
 *      사용방법   extends 추상클래스명            implement 인터페이스명
 *     ====================================================== 
 *      변수      변  셔                       상수    
 *     ======================================================
 *     메소드      구현이 된 메소드
 *               구현이 안된 메소드            구현이 안된 메소드                 
 *     ======================================================
 *      접근지정어  접근지정어 전체사용이 가능          public   만
 *                                           사용이 가능     
 *     ☆☆☆☆☆  인터페이스가 중심
 *            --------
 *            = 컬렉션
 *            = 데이터베이스
 *              컬렉현 
 *                                   Collection
 *                  _____________________|____________________________
 *                 |                     |                            |
 *         => ArrayList list = new ArrayList
 *            LinkedList list = new LinkedList()
 *            Vector list = now Vector()
 *            ----------------------------------
 *            
 *            List list = new ArrayList()
 *                 list = new Vector()
 *                 list = new LinkedList()
 *            -----------------------------------
 *            => 이벤트 처리 (윈도우) => 행위를 했을때 처리
 *               ------- 키보드 입력, 버튼 클릭, 마우스 클릭
 *               
 *                => ActionListener : JButton, JMenu , JRadio
 *                -----------------
 *                => MaouseListener : JTable
 *                => KeyListener : JTextField
 *                ----------------- 모든 컴포너트 가능
 *                
 *                ☆☆☆☆☆ 구현을 하지 않고 내려주는 이유
 *                => 프로그램마다 구현하는 기능이 다르기 때문에..
 *                => 버튼
 *                   ------ 버튼 에
 *                   로그인 / 취소 / 회원가입 / 계산기 / 검색 ...
 *                => 프로그램에 맞게 구현해서 사용해라
 *                   설계된 메소드만 전송
 *                   ------------------> 구현이 안된 메소드
 *          ________________________ 
 *         | 객체지향의 객체란? => 90%   |
 *         | 캡슐화 VS 은닉화           |
 *         | 상속 VS 포함              |
 *         | ----------------------- 
 *         |                        |
 *         | 예외처리의 종류와 목적        |
 *         | 컬렉션                   |
 *         --------------------------
 *          
 *          
 *          
 *      class ClassName {
 *          ----------------------
 *          변수 : 필요데이터 => 출력 화면
 *                => 목록 (X) => 요약
 *                => 상세보기
 *          ----------------------
 *          메소드 : 어떤기능 => 메뉴
 *          ----------------------
 *          생성자 : 오버로딩
 *                 초기화 / 시작과 동시에 처리 => 자동로그인 / 보안 .. / 데이터베이스 드라이버 등록
 *          ----------------------
 *      }
 *      
 *      =========================================================================
 *      예외처리 
 *      =====
 *       목적 : 사전에 에러를 방지하는 프로그램
 *       정의: 비정상 종료를 방지하고 정상 종료를 수행하게 만든다
 *           -> 직접 처리 : 프로그래머가 직접 에러를 처리 => 에러복구
 *               try ~ catch ~ finally  => 거의 대부분 try chatch 사용
 *                                          -----------------------
 *                                           웹 => DB연동 (java.sql => CheckedException)
 *           -> 간접 처리 : 에러 발생에 대한 선언 => 사용시에 반드시 예외처리후에 사용
 *               throws 에러 떠넘기기
 *          ----------------------------------------------------------------------------------
 *           try ~ catch 는 여러개 사용이 가능 
 *           ------------------------------> 순서가 존재한다
 *               상속은 위로 올라갈수록 크다 => 위로 올라갈수록 예외처리하는 범위가 커진다 
 *                        상속
 *                        ----
 *                        
 *                        Object
 *                          |
 *                        Throwable : Exception / Error
 *                   _______|___________
 *                  |                   |
 *                Error              Exception
 *                처리가 불가능          처리가 가능 => 소스상에서 변경이 가능
 *                           ____________|_____________
 *                          |                          |
 *                      CheckedException          UnCheckedException
 *                          |                          |
 *                        java.io                     RuntimeException
 *                        IOException                  => NumberFormatException
 *                        FileNotFoundException			  Integer.parseInt()
 *                        java.sql					   => NullPointerException
 *                        SQLException                 => ArrayIndexOutOfBoundsException
 *                        java.lang                       StringTokenizer
 *                        ClassNotFoundException
 *                        Class.forName()
 *                        InterrptedException 
 *              
 *             ------------------------------------------------------------------------------------
 *               throws => 순서가 없다 
 *             =========================== Exception / Throwable
 *             
 *                      
 *                오라클 연동 : 예외처리를 가지고 있다
 *                -------
 *                JDBC : 자바에서 제공하는 라이브러리
 *                 |
 *                DBCP : 웹에서 주로 사용하는 기술
 *                 |
 *                ORM : => 실무에서 사용하는 기술
 *                ---- MyBatis (85%) , JPA (15%)
 *                
 *                JavaScript
 *                ----------
 *                     |
 *                  Jquery  (Ajax) ------ sist 원래 과정
 *                     |
 *                    Vue
 *                     |
 *                   React 
 *                     |
 *                   Redux
 *                     |
 *                   React-Query
 *                     |
 *                   NextJS  ------ 더 배우는 과정
 *                     |
 *                   TypeScript << 이번에 취업 못하면 따로 배워야 하는것
 *            ------------------------------------------------------------   
 *                
 *      라이브러리
 *          9장 ~ 11장
 *          java.lang
 *              Object : 최상위 클래스
 *                = toString() -> 객체를 문자열로 변경
 *                = finalize() -> 소멸자
 *                = clone() -> 복제
 *              String : 문자열 저장 클래스
 *                = equals() -> 문자열이 같은경우 (==은 주소값 비교시에 사용 문자열에는 x)
 *                = contains() -> 검색시 포함된 단어인지
 *                = startsWith() -> 서제스트 (자동완성기능)
 *                = indexOf() / lastIndexOf() -> 지정된 문자 위치를 찾는 경우 (인덱스번호 찾을때)
 *                = valueOf() -> 모든 데이터형을 문자열형 으로 변경
 *                = substring() -> 문자열을 자르는경우
 *                = length()-> 문자 갯수확인
 *                = trim() -> 좌우 공백 제거
 *                ----------------------------- 웹 프로그램은 문자열로 되어있음 때문에 문자열 제어를 할 수 있어야 함
 *              StringBuffer : 문자열 결합
 *                = append() -> 최적화 (문자열+문자열 보다 빠르다)
 *                = toString() -> 저장된 모든 데이터를 문자열
 *              Math : 수학
 *                = random() : 임의로 값을 추출
 *                = ceil() : 올림 함수                ____> 클래스만 지정이 가능
 *              Wrapper : 기본형을 클래스화 시켜준다 -목적-> 제네릭 에서 사용
 *                = Integer -> int 클래스화  => parseInt() => 문자열을 정수로 변환
 *                = Double -> double 클래스화 => parseDouble() => 문자열을 실수형으로 변환
 *                  ex) 크롤링시 3.9 이라는 별점에 대해서 크롤링을 해오면 문자열로 받아오게 된다
 *                      그대로 문자열로 출력을 시키면 별점이 변하지 않고 3.9 가 박힌다
 *                      그걸 방지하기 위해 크롤링 후 parsDouble() 을 통해 
 *                      문자열을 실수형으로 다시 변경해 줄때 사용하는게 pars 이다.
 *                = Boolean -> boolean 클래스화 => parseBoolean() => 문자열을 논리형으로 변환
 *                = Byte -> byte 클래스화 => parseByte() => 문자열을 바이트로 변환
 *                
 *                Integer i = 10 ; 오토박싱     int를 클래스화 시켜줌 = 오토박싱
 *                int ii=i; 언박싱             클래스에 저장된 값 = 언박싱
 *                --------------------------- 호환이 된다
 *                 => 웹, 윈도우는 모든 데이터를 문자열로 인식한다(기본형이 없다)
 *                 
 *          java.util : 프로그램에서 많이 사용하는 클래스의 집합
 *              Random : Math.random() => 보완
 *                    => nextInt(int bounds)
 *                               ---------- 이곳에 들어가는게 범위 마지막은 제외
 *                       nextInt(100) => 0~99
 *                       
 *              StringTokemizer : 문자열을 구분자별로 자르는 경우
 *                    => split() 를 보완
 *                  = nextToken() -> 자른 단어를 읽어올때
 *                  = hasMoreTokens() -> 자른 갯수만큼 루프
 *                  = countTokens() -> 자른 갯수를 가져올때
 *                  
 *              Date : 오라클의 데이터형과 호환 -> 기능은 없다
 *              
 *              Calendar : Date 에 없는 기능을 보완 => 요일, 마지막날 구하기 -> 달력만들기 외에는 잘 사용하지 않는다
 *              
 *              Colletion : 배열의 단점을 보완 (고정적이 아닌 가변형으로 변환(갯수를 지정하지 않아서 넣은대로 들어감))
 *                  
 *                  List / Set / Map
 *                  ----    |    ---
 *               ArrayList  |    HashMap
 *                        HashSet => 중복 제거 -> 웹 소켓 에서 주로 사용
 *                               
 *                  List : 데이터 중복 허용
 *                         순서가 있다 => 인덱스가 있다 (삭제, 추가 시 자동으로 순서를 변경해줘서 순차적을 계속 유지)
 *                                     0번부터 시작
 *                        = ArrayList --> 주로 데이터베이스에서 추출한 데이터를 브라우저로 전송시, 윈도우 에서 자주 쓰임 
 *                         ----------     (배열대신 쓰이다보니 모아서 보내주는 형태)
 *                           add() : 추가
 *                           size() : 저장 갯수
 *                           get() : 데이터 읽기
 *                           clear() : 전체 삭제
 *                           isEmpty() : 존재여부(존재하지 않으면 true)
 *                  
 *                  Set : 데이터 중복을 허용하지 않음
 *                        순서가 있다 => 출력시 어떤게 먼저 나올지 그때마다 바뀐다
 *                        
 *                        = HashSet --> 웹소켓(브라우저에서 채팅, 접속자마다 쪽지전송 ...) 접속자가 중복이 되면 안된다
 *                          -------                                           그렇기 때문에 Set class 사용
 *                            add() : 추가
 *                            size() : 갯수
 *                            get() : 데이터 읽기
 *                            clear() : 전체 삭제
 *                            isEmpty() : 존재 여부
 *                  
 *                  Map : 키, 값을 동시에 저장
 *                        키는 중복할 수 없다, 값은 중복이 가능
 *                        
 *                        = HashMap  --> 클래스를 모아서 관리, 웹에 전송, 웹에서 응답, 쿠키 저장, 세션에 저장 
 *                          -------                      ?page=1
 *                            put() : 추가
 *                            size() : 저장 갯수
 *                            get() : 데이터 읽기
 *                            clear() : 전체 삭제
 *                            isEmpty() : 존재 여부
 *                            
 *              ☆☆☆☆☆ 저장된 데이터형 => 프로그래머가 어떤 데이터를 저장할 지 모른다
 *                                   -------------------------------
 *                                   => 어떤 데이터든 상관없이 받을 수 있게 제장 => Object
 *                                   => 리턴형 / 매개변수 => Object 로 되어있다
 *                                                      ------ 가장 큰 데이터형이다 => 형 변환을 해서 사용
 *              ☆☆☆☆☆ Object 를 전체 변경이 가능하게 만든다 (프로그램에 맞는 데이터형으로 변경) 
 *                 |   => 데이터형을 통일화                  |
 *                 |   => 가독성이 좋다 (데이터 확인이 가능하다)  |
 *                 |   => 형변환이 없기때문에 간결하다          |                                     
 *                 |-----------------------------------|---> 제네릭 <>
 *                                                             <클래스> -> <int>(x) -> <Integer>
 *                                                       컬렉션은 제네릭을 이용해서 제어한다 
 *                                  
 *              
 *          java.text
 *              DecimalFormat : 숫자 변환 new DecimalFormat("##,###,###")
 *              SimpleDateFormat : 날짜변환 new SimpleDateFormat("yyyy/MM/dd")
 *              ----------------------------- format() : 변경
 *              String.format("%d%d",1,2) => printf() 와 동일
 *                     ------
 *          java.io : 입출력
 *              FileInputStream / FileOutputStrea -> 다운로드 업로드
 *              FileReader / FileWriter => 파일에 한글이 있는 경우에 제어
 *              BufferedReader / BufferedWriter -> 메모리에 파일의 내용을 읽어놓고 제어
 *              -------------- / ---------------> 제어속도가 빠르다
 *              read()/close()     white()
 *                ==> -1 : EOF (파일의 끝)
 *                         End Of File 
 *              
 *          ☆☆☆☆☆☆☆☆☆☆ java.sql ☆☆☆☆☆☆☆☆☆☆
 *          |    1. 드라이버 등록              |   오라클 언어를 배우는 것이 아니라 
 *          |      Class.forName(드라이버명)  |         자바에서 오라클을 제어하는 언어를 배운다
 *          |    2. 오라클 연결               |   
 *          |      Connection              |   
 *          |    3. 오라클로 명령어 전송         |   오라클의 명령어 : SQL = 구조화된 질의 언어
 *          |      PreparedStatement       |                ----
 *          |    4. 결과값 얻기               |                 DML = 데이터 조작언어 -> 프로그래머가 주로 사용
 *          |      ResultSet               |                 DDL = 정의 언어
 *          --------------------------------                 DCL = 제어 언어
 *                                                           TCL = 트랜잭션 언어
 *                                                           
 *          ---------------------------- javax.serclet.http ...  JSP
 *          ---------------------------- org.springframework ... Spring
 *          
 *          
 *             
 *      
 *      
 */
class Sist {
//	 static 보다 => 인스턴스를 사용해야 편리하다
//	 static 은 공통 메소드 라고 불리고
//	 인스턴스 는 멤버 메소드라고 한다 -> 멤버는 멤버만 사용이 가능하게 만든다
	private int sabun;
	private String name;

	public static void setData(Sist s) { // static 에서는 동일한 객체를 사용하기 위해서 매개변수를 이용해서
		s.setSabun(10);
		s.setName("홍길동");
	}

	public Sist() {
		setData(this);
	}

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class 정리_1 {
	public static void main(String args[]) {
		Sist ss = new Sist();

		System.out.println("ss.sabun=" + ss.getSabun());
		System.out.println("ss.name=" + ss.getName());

	}
}
