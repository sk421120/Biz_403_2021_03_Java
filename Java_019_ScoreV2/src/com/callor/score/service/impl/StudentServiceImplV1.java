package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	protected List<StudentVO> studentList;
	protected final Integer 학번 = 0;
	protected final Integer 이름 = 1;
	protected final Integer 학년 = 2;
	protected final Integer 학반 = 3;
	protected final Integer 학과 = 4;
	protected final Integer 주소 = 5;
	protected String fileName;
	
	/*
	 * new StudentServiceImplV1() 생성자를 호출하여 객체를 생성하려고 하면
	 * 고정된 파일이름("src....txt")을 사용하여 파일을 읽을 수 있도록 할 예정이다.
	 * 
	 * 생성자에서는 new StudentServiceImplV1("파일명") 의 생성자 method 다시 호출하는 구조
	 */
	public StudentServiceImplV1() {
		// 여기에서 다음의 생성자 메서드를 또 한번 호출
		// new StudentServiceImplV1("src...txt");
		this("src/com/callor/score/student.txt");
	}
	
	public StudentServiceImplV1(String fileName) {
		this.fileName = fileName;
		studentList = new ArrayList<StudentVO>();
		// 클래스를 객체로 생성할 때 method를 호출하여 데이터를 사용하도록 준비해 달라
		this.loadStudent();		
	}
	
	@Override
	public void insertStudent() {
		// TODO 학번, 이름, 국어, 영어, 수학 점수 입력 받아 추가하기
		
		
		
	}
	/*
	 * student.txt 파일에서 학생정보를 읽어 studentList 에 데이터 준비하기
	 */
	@Override
	public void loadStudent() {
		// TODO 학생 파일에서 학생 불러오기
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			String read = new String();
			
			// 파일로 부터 읽은 값이 EOF(End Of FIle)에 다다랐다
			while( (read = buffer.readLine() ) != null ) {
				String[] info = read.split(":");
				
				StudentVO vo = new StudentVO();
				vo.setNum(info[학번]);
				vo.setName(info[이름]);
				vo.setGrade(info[학년]);
				vo.setDept(info[학과]);
				vo.setAddress(info[주소]);
				// Debugging Code
				// System.out.println(vo.toString());
				studentList.add(vo);
				
			}
			
			buffer.close();
			
			System.out.println(fileName + " 불러오기 완료");
		} catch (FileNotFoundException e) {
			System.out.println(fileName + " 파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽는 동안 문제가 발생했습니다.");
		}
	}

	@Override
	public StudentVO getStudent(String num) {
		// TODO 학번 맞는 학생정보 return하기
		// 1번 코드
//		int nSize = studentList.size();
//		for(int i = 0 ; i < nSize ; i++) {
//			StudentVO vo = studentList.get(i);
//			if( num.equals( vo.getNum() ) ) {
//				return vo;
//			}
//
//		}
		
		// 2번 코드
		for(StudentVO vo : studentList) {
			if(vo.getNum().equals(num)) return vo;
		}
		
		return null;
	}
	
	private void findStudent() {
		// TODO 학생 학번으로 조회하고 출력하기
		Random rnd = new Random();
		
		int findNum = rnd.nextInt(studentList.size());
		String strNum = String.format("%05d", findNum);
		
		System.out.println(strNum);
		
		StudentVO vo = this.getStudent(strNum);
		
		if(vo != null) {
			System.out.println("=".repeat(100));
			System.out.println(" 학번\t 이름\t학년\t    학과\t\t\t주소");
			System.out.println("-".repeat(100));
			System.out.printf("%s\t", vo.getNum());
			System.out.printf("%s\t", vo.getName());
			System.out.printf("%3s\t", vo.getGrade());
			System.out.printf("%6s\t", vo.getDept());
			System.out.printf("%s\n", vo.getAddress());
			System.out.println("=".repeat(100));
		} else {
			System.out.println("찾으시는 학생 정보가 없습니다.");
		}
	}

	@Override
	public void printStudent() {
		// TODO 학생 리스트 출력하기
		/*
		 * 배열을 사용하여 for() 반복문을 구현할때는 배열.length 속성을 직접 반복문의 조건을 설정한다
		 * 	i < 배열.length
		 * 
		 * List 객체는 특성상 수시로 데이터의 개수가 변경된다
		 * List에 담긴 개수를 알려주는 size() method는 호출할때마다 List에 담긴 데이터 개수를
		 * 	다시 헤아리는 코드가 실행된다.
		 * 
		 * for() 반복문 내에서 i < list.size() 코드를 사용하면 for() 반복문이 반복되는 동안 계속해서
		 * 	개수를 헤아리게 된다
		 * 데이터의 개수가 몇개 안될때는 큰 문제가 없지만 데이터 개수가 많아지면 그만큼 성능이 떨어지게 된다
		 * 
		 * list 전체를 for() 반복문을 사용하여 순회할때는 먼저 size() 값을 int 형 변수에 담아놓고 시작하자
		 */
		int nSize = studentList.size();
		System.out.println("=".repeat(100));
		System.out.println(" 학번\t 이름\t학년\t    학과\t\t\t주소");
		System.out.println("-".repeat(100));
		for(int i = 0 ; i < nSize ; i++) {
			StudentVO vo = studentList.get(i++);
			System.out.printf("%s\t", vo.getNum());
			System.out.printf("%s\t", vo.getName());
			System.out.printf("%3s\t", vo.getGrade());
			System.out.printf("%6s\t", vo.getDept());
			System.out.printf("%s\n", vo.getAddress());
		}
		System.out.println("=".repeat(100));
	}

}
