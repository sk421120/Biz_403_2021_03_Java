package com.callor.score.service.model;

/*
 * 데이터를 담아서 정보처리를 수행할 때 편리하게 데이터를 묶어서 관리하기 위한 클래스
 * VO를 만드는 작업 : 데이터 모델링(설계하기)
 * 1. 추상화
 * 2. 정보은닉
 * 3. 캡슐화
 * 4. 재정의(Override)
 * 
 * 모델링 된 ScoreVO를 실제로 사용할 때는 객체로 생성한다.
 * ScoreVO scoreVO = new ScoreVO();
 * 필요할때마다 객체를 생성하고, 데이터를 Setter하고 연산을 수행한 후 데이터를 Getter하는 방식 활용
 * 
 * DB항목에서는 Entity 모델링 이라고 한다.
 * 모델링 된 Entity를 data TABLE 로 생성하여 사용한다
 * 한번 TABLE을 생성하고 영구적으로 사용한다.
 */
public class ScoreVO {

	private String num;
	private String name;
	
	// VO 클래스에 숫자형변수를 선언할 때 primitive 형이 아닌
	//  wrapper 클래스 형으로 선언할 때는 0으로 clear를 해주자.
	// 이러한 불편을 방지하기 위하여 primitive 형으로 만들기도 하지만 null값 취급하기가 어려움
	private Integer intKor = 1;
	private Integer intEng = 2;
	private Integer intMath = 3;
	
	/*
	 * VO 클래스를 모델링하고 : 추상화
	 * 변수를 private으로 선언하였다. : 정보은닉
	 * 은닉된 변수에 접근하기 위하여 getter, setter method를 생성
	 * 
	 * getter와 setter를 생성하고 봤더니 총점(total)과 평균(avg)는
	 * 점수가 입력되면 항상 계산되어야 하는 항목이다.
	 * 즉, 외부에서 이 변수에 값을 저장할 일이 별로 없을 것 같다.
	 * 	외부에서 total, avg 값을 요청하면 그때 그때 계산하여 return을 하면 될 것 같다.
	 * 
	 * 1. total, avg 변수를 삭제하고
	 * 2. total, avg 변수의 setter method를 제거한다
	 * 3. total, avg 변수의 getter method를 변경한다
	 * 	과목총점과 과목평균을 계산하여 return 하도록
	 */
	
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
	public Integer getIntKor() {
		return intKor;
	}
	public void setIntKor(Integer intKor) {
		this.intKor = intKor;
	}
	public Integer getIntEng() {
		return intEng;
	}
	public void setIntEng(Integer intEng) {
		this.intEng = intEng;
	}
	public Integer getIntMath() {
		return intMath;
	}
	public void setIntMath(Integer intMath) {
		this.intMath = intMath;
	}
	/*
	 * 캡슐화
	 * 외부에서 객체.getTotal() method를 호출하면 과목의 총점을 return 받을 수 있다.
	 * 
	 * 실제 코드는 3과목의 총점을 계산하고 계산된 결과를 return하는 구조로 되어 있다.
	 * 
	 * 하지만 외부에서는 실제코드가 어떻게 작동되는지 몰라도 또는 관심 갖지 않아도
	 * 상관없이 getTotal() method는 당연히 잘 계산된 총점결과를 알려준다는 것을 알고 있다
	 * 
	 * 이렇게 내부코드를 감추고(외부에 노출하지 않고도) 기능을 충실히 수행할 수 있도록 하는것
	 */
	public Integer getTotal() {
		Integer total = this.intKor;
		total += this.intEng;
		total += this.intMath;	
		return total;
	}
	
	public Float getAvg() {
		Float avg = (float) this.getTotal() / 3;
		return avg;
	}
	
	/*
	 * 재정의(Override)
	 * toString() method는 Object 클래스에 정의되어 있으며 모든 클래스는 자동적으로
	 * Object 클래스를 상속받는다
	 * 
	 * 따라서 ScoreVO 클래스에는 자동으로 toString() method가 있는 것처럼 동작할 것이다.
	 * 
	 * 하지만, Object 클래스에 정의된 toString() method는 사용하는데 의미가 없다.
	 * 
	 * 그래서 toString() method를 VO 객체의 변수에 담긴 값들을 문자열로 만들어
	 * return하는 코드로 다시 작성을 한다
	 * 이제 vo객체.toString() method를 호출하면 vo객체의 변수들에 담긴 값들이 출력될 것이다.
	 */
	
	@Override
	public String toString() {
		return num
				+ "\t" + name
				+ "\t" + intKor
				+ "\t" + intEng
				+ "\t" + intMath
				+ "\t" + this.getTotal()
				+ "\t" + this.getAvg() + "\n";
	}
	
}
