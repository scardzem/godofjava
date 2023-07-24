package study.d.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSample {

	public static void main(String[] args) {
		TreeMapSample sample = new TreeMapSample();
		sample.checkTreeMap();
	}
	
	//TreeMap은 데이터를 저장할때 Key 순서대로 정렬한다. (숫자->영어대문자->영어소문자->한글)
	//key를 정렬하면서 저장하기 때문에 HashMap보다 조금 느리지만, 1000단위 개수의 데이터를 처리할 때 정렬이 필요하다면 TreeMap을 사용하는 것이 유용하다.
	public void checkTreeMap() {
		TreeMap<String, String> map = new TreeMap<>();
		map.put("A", "a");
		map.put("가", "e");
		map.put("1", "f");
		map.put("a", "g");
		
		Set<Map.Entry<String,String>> entries = map.entrySet();
		for(Map.Entry<String,String> tempEntry : entries) {
			System.out.println(tempEntry);
		}
	}
}
