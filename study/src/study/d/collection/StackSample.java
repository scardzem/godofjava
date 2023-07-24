package study.d.collection;

import java.util.Stack;

public class StackSample {

	public static void main(String[] args) {
		StackSample sample = new StackSample();
		sample.checkPop();
	}
	
	public void checkPeek() {
		Stack<Integer> intStack = new Stack<>();
		for(int i=0;i<5;i++) {
			intStack.push(i);
			System.out.println("가장 위의 값 : "+intStack.peek());
		}
		System.out.println("size = " + intStack.size());
	}

	public void checkPop() {
		Stack<Integer> intStack = new Stack<>();
		for(int i=0;i<5;i++) {
			intStack.push(i);
			System.out.println(intStack.pop());  //값을 넣고 바로 삭제. for문때문에 들어가는 값만 0~4가 입력되는것.
		}
		System.out.println("size = " + intStack.size());
	}

}
