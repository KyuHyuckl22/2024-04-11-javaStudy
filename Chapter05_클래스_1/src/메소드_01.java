/*
 *   프로그램을 잘 짜고싶다면 여기부터 시작이다
 *   -----=> 관련된 내용끼리 잘 묶어서 재사용
 *   데이터 관리                   명령문 관리            출력관리
 *  ---------                  ---------                               
 *  1) 한개씩 저장후 관리            1)연산자
 *     ---- 변수 / 상수           2)결과값 도출     
 *  2) 여러개 동시에 저장후 관리
 *     ---- 배열 / 클래스
 *     배열: 같은 데이터형을 
 *             묶어서 관리
 *     클래스: 다른데이터형을 
 *           묶어서 관리  
 *    --------메모리에 저장(RAM)
 *    프로그램 종료시 사라진다
 *  3) 영구적인 저장 장치
 *    -------------
 *    =파일 : 보안 취약
 *    =오라클 (RDBMS)
 *  => 자바+오라클
 *      |  (저장)
 *    데이터 읽어서 => 브라우저
 *    HTML/CSS/JavaScript
 *    => 오라클 연결할 수 없다
 *    자바           오라클
 *    ---           ----
 *    HTML/오라클
 *    둘다 읽기 가능
 *    ASP=>오라클=>C#
 *    DJango=>오라클=>파이썬
 *    ------------------
 *    자바 => 데이터관리
 *       메모리에 저장
 *          어디까지 저장기간
 *           => 지역변수 : 메소드 종료와 동시에 사라진다
 *              리턴형 / 매개변수
 *           => 전역변수 : 프로그램 종료시까지 사용
 *              클래스 안에 있는 모든 메소드가
 *              메 모 리 공유
 *              ----------
 *     class class
 *     --------------------------
 *     
 *     --------------------------
 *     
 *     --------------------------
 *     젼수 설정 : 전역 변수 => 자동으로 초기화
 *     static int a; => 0값 => 클래스 모든 영역에서 사용이 가능
 *                         => 다른 클래스 에서도 사용이 가능
 *     --------------------------
 *     생성자
 *     --------------------------
 *     
 *     static void display1()
 *     {
 *          변수를 이 블럭 안 에서 잡는다면
 *          이 변수는 이 블럭 안에서 사용이 가능
 *     }
 *     ---------------------------
 *     값을 계속 유지하는 변수 ... 전역변수
 *     사용 후 버린다 ... 지역변수
 *     
 *     ==> 클래스 구성 제작
 *     --------------
 *     1.데이터보호 : 캡슐화
 *     2. 재사용 ;상속
 *     3. 수정 , 추가 : 다형성 (오버라이딩, 오버로딩,)
 *     -------------객체지향 프로그램의 3대 특성
 *     
 *     클래스의 종류
 *     ----------
 *     일반 클래스 / 추상 / 인터페이스 / 내부 클랫 / 익명의 클래스 / 지영클래스 / 멤버클래스
 *          
 *     
 *     1.package=> 한번만 사용이가능
 *      import java.util.*;
 *      ----------------- 패키지
 *      import...
 *      2. class ClassName
 *      {
 *      ----------------------------
 *       변수 목록     
 *         지역변수
 *         ------ 전역변수
 *          멤버변수 : 각각 따로 저장하는 변수 => new 저장 (새로운 메모리에 저장)
 *          공유변수 : static => 자동 메모리 할당
 *          --------------
 *      ----------------------------
 *       생성자
 *      ----------------------------
 *       메소드
 *       {
 *          변수 목록
 *          ...
 *          ...
 *       }   
 *      
 *      }
 */
public class 메소드_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
