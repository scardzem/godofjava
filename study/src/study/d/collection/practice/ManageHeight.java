package study.d.collection.practice;

import java.util.ArrayList;

public class ManageHeight {
	ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<>();  //학년 키

	public static void main(String[] args) {
		ManageHeight sample = new ManageHeight();
		sample.setData();
		for(int i=1;i<=5;i++) {
			sample.printAverage(i);
			System.out.println();
		}
	}
	
	
	public void setData() {
		ArrayList<Integer> classNo1 = new ArrayList<>();  //반별 키
		ArrayList<Integer> classNo2 = new ArrayList<>();  //반별 키
		ArrayList<Integer> classNo3 = new ArrayList<>();  //반별 키
		ArrayList<Integer> classNo4 = new ArrayList<>();  //반별 키
		ArrayList<Integer> classNo5 = new ArrayList<>();  //반별 키
		classNo1.add(170);
		classNo1.add(180);
		classNo1.add(173);
		classNo1.add(175);
		classNo1.add(177);
		
		classNo2.add(160);
		classNo2.add(165);
		classNo2.add(167);
		classNo2.add(186);
		
		classNo3.add(158);
		classNo3.add(177);
		classNo3.add(187);
		classNo3.add(176);
		
		classNo4.add(173);
		classNo4.add(182);
		classNo4.add(181);
		
		classNo5.add(170);
		classNo5.add(180);
		classNo5.add(165);
		classNo5.add(177);
		classNo5.add(172);
		gradeHeights.add(classNo1);
		gradeHeights.add(classNo2);
		gradeHeights.add(classNo3);
		gradeHeights.add(classNo4);
		gradeHeights.add(classNo5);
	}
	
	public void printHeight(int classNo) {
		ArrayList<Integer> classHeight = gradeHeights.get(classNo - 1);
		System.out.println("class No. : "+ classNo);
		for(int i=0;i<classHeight.size();i++) {
			System.out.println(classHeight.get(i));
		}
	}
	
	public void printAverage(int classNo) {
		ArrayList<Integer> classHeightValue = gradeHeights.get(classNo-1);
		
		double sum = 0;
		for(int i=0; i<classHeightValue.size(); i++) {
			sum += (double)classHeightValue.get(i);
		}
		System.out.println("class No. : " + classNo);
		Double result = sum/classHeightValue.size();
		System.out.println("Height average : " + result);
	}

}
