package com.callor.app.service.model;

public class ScoreVO {

	private String num;
	private String name;
	private Integer kor;
	private Integer eng;
	private Integer math;

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
		Integer sum = this.kor;
		sum += this.eng;
		sum += this.math;
		return sum;
	}

	public Float getAvg() {
		// C언어 style
		Float avg = (float) this.getTotal() / 3;

		// java style
		avg = Float.valueOf(this.getTotal()) / 3;
		return avg;
	}

	// getter setter toString
	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + this.getTotal() + ", avg=" + this.getAvg() + "]";
	}

}
