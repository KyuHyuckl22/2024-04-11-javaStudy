package com.sist.io;
/*
 *    355p
 *    ----
 *        1. java.io : CheckedException 을 가지고 있다 => 예외처리를 반드시 한다
 *            = io : 입출력
 *              inputStream / outputStream
 *                   ↓             ↓
 *                read()         write()
 *                 읽기             쓰기
 *            = Stream : 데이터가 이동하는 통로
 *              FIFO : 먼저 들어간 값이 먼저 나오는 방식 => Queue
 *        2. File
 *        3. FileInputStream / FileOutputStream
 *        4. FileReader / FileWriter
 *        5. BufferedReader / BufferedWriter
 *        6. BufferedInputStream / BufferedOutputStream
 *        7. ObjectInputStream / ObjectOutputStream
 *    -------------------------------------------------------------------------------------
 *        InputStream  /  OutputStram    :  읽기 / 쓰기 -> 1byte 씩 읽기를 한다 => 한글이 깨진다
 *            =>  업로드 / 다운로드시 주로 사용한다
 *            => 바이트 스트림
 *            
 *        Reader    /   Writer : 읽기 / 쓰기 -> 2byte 씩 읽기를 한다 => 한글이 정상적이다
 *            => 파일 읽기 / 쓰기 (한글 포함)
 *            => 문자 스트림    
 *        => movie.txt 할때 FileReader 를 주로 사용했었다. (이유: 한글이 깨지면 안되니까)
 *        
 *        1. 메모리에 저장 => 프로그램이 종료가 되면 모든 데이터가 사라진다
 *           -------- 속도가 빠르다
 *           |
 *        영구적으로 저장하는 장치
 *             파일
 *             --- 1. 데이터 노출 / 2. 잊어버릴 가능성 / 3. 관련된 데이터를 따로 저장해서 처리하가 어려움 /
 *                 4. 구분자가 없다 => 배열에 저장 , ArrayList에 저장해서 사용
 *                 
 *                  ---------------------------------------------------------------
 *                  => 위 문제사항을 보완 : RDBS
 *                  => 오라클은 업로드 다운로드가 어려워서 우리가 도와줘야한다
 *                  => 추천 =>카페 / 블로그=> 읽은 데이터를 파일에 저장후에 분석 => 분석된 데이터를 오라클로 전송
 *        2. 파일 정보 => 376p 파일 입출력
 *           ------    --------
 *                      377p에 나오는 메소드 중요
 *             File : 파일, 폴더 정보를 가지고 있다
 *             -----------------------------
 *             File 정보와 관련된 메소드
 *             File 생성자
 *             ---------
 *                 File file = new File("경로명/파일명") => 파일에 대한 정보를 가지고 온다
 *                 File dir  = new File("경로명") => 폴더에 대한 정보를 가지고 온다
 *              ☆☆ 1) 파일명 읽기  => getName() : String
 *                 2) 경로명 읽기 => getParent() : String
 *              ☆☆ 3) 파일명+경로명 읽기  => getPath() : String
 *              ☆☆ 4) 파일 크기  => length() : long
 *                 5) 숨긴 파일 여부  => isHidden() : boolean
 *                 6) 읽기 가능 여보  => canRead() : boolean
 *                 7) 쓰기 가능 여부  => canWrite() :boolean
 *                 8) 수정일  => lastModified() : long
 *              ☆☆ 9) 파일 정보를 한번에 읽기(폴더)  => listFiles() : File[]
 *                 10) 파일 여부 확인  => isFile : boolean
 *                 11) 폴더 여부 확인  => isDirectory() : boolean
 *             File 제어하는 메소드
 *              ☆☆ 1) 폴더 생성 : mkdir()
 *              ☆☆ 2) 파일 생성 : createNewFile()
 *              ☆☆ 3) 파일 삭제 : deldte()
 *              ☆☆ 4) 파일 존재 여부 : exists()
 *              ------------------------------- 파일 입출력 / 파일 복사 / 속도의 최적화
 *                  
 */
import java.io.*;
import java.text.*;
import java.util.*;
public class 라이브러리_1 {

	public static void main(String[] args) {
		File file = new File("c:\\javaDev\\melon.txt");
		System.out.println("파일명 : "+file.getName());
		System.out.println("경로명 : "+file.getParent());
		System.out.println("파일명 + 경로명 : "+file.getPath());
		System.out.println("숨긴 파일 : "+file.isHidden());
		System.out.println("읽기 전용 : "+file.canRead());
		System.out.println("쓰기 전용 : "+file.canWrite());
		System.out.println("파일 여부 : "+file.isFile());
//		수정일은 long 형이라 전에 배웠던 SimpleDateFormat 을 이용해
//		보기 편하게 출력 ↓
		System.out.println("수정일 : "+new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(new Date(file.lastModified())));
		System.out.println("파일 크기 : "+file.length());
	}

}
