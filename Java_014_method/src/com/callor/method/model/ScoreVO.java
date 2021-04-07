package com.callor.method.model;

/*
 * 성적처리를 하는 데이터를 저장하기 위한 VO 클래스 설계
 * 
 * 학번, 학생이름, 국어, 영어, 수학, 총점, 평균
 * 
 */
public class ScoreVO {

	private String num;
	private String name;
	private Integer kor;
	private Integer eng;
	private Integer math;
	private Integer total;
//	private float avg;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getKor() {
		return kor;
	}
	public void setKor(Integer kor) {
		this.kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getTotal() {
		this.total = this.kor + this.eng + this.math;
		return this.total;
	}
	
	public float getAvg() {
		return (float)this.total / 3;
	}
}
