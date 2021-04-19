public void startGame() {
	// 1번
	String word[] = suffleWord();
	inputWord(word);
}

public String[] suffleWord() {
	// 2번
	String word[] = suffleWord("KOREA");
	return word;
}

public String[] suffleWord(String word) {
	// 3번
}

public void inputWord(String[] word) {
	// 4번
	셔플한 단어를 매개변수로 받고
	프롬프트 보여주고
	셔플한 단어 보여주고
	키보드 입력받기
}

public void inputWord() {
	프롬프트 보여주고
	셔플한 단어 가져오고
	셔플한 단어 보여주고
	키보드 입력받고
}

결합도는 낮추고 응집도는 높인 코드