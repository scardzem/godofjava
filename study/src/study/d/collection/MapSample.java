package study.d.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {
	public static void main(String[] args) {
		MapSample sample = new MapSample();
		sample.checkRemove();
	}
	public void checkHashMap() {
		HashMap<String, String> map = new HashMap<>();
		map.put("A", "a");
		System.out.println(map.get("A"));
		System.out.println(map.get("B")); //없는 값을 호출해도 예외가 발생하지 않고 null이 반환된다. (Collection에서는 없는걸 호출하면 ArrayIndexOutOfBoundsException이라는 예외가 발생한다.)
		map.put("A", "1");
		System.out.println(map.get("A"));
	}
	
	//keySet() 사용 예제  (644)
	public void checkKeySet() {  
		HashMap<String,String> map = new HashMap<>();
		map.put("A", "a");
		map.put("C", "c");
		map.put("D", "d");
		Set<String> keySet = map.keySet();  //keySet()의 리턴타입이 Set이기 때문에 Set타입의 변수에 할당해준다.
		for(String tempKey: keySet) {
			System.out.println(tempKey +" = "+ map.get(tempKey));  //tempKey에 할당되는 값들은 HashMap에 담겨있는 키 값일 것이므로, get()메소드로 값을 확인한다.
		}
	}
	
	//values() 사용 예제 (645)
	public void checkValues() {
		HashMap<String,String> map = new HashMap<>();
		map.put("A", "a");
		map.put("C", "c");
		map.put("D", "d");
		
		Collection<String> values = map.values();
		for(String tempValue : values) {
			System.out.println(tempValue);
		}
	}
	
	//Map의 값을 꺼내는 방법 중에 entrySet()이라는 메소드를 사용할 수도 있다. 이 메소드를 사용하면 Map에 선언된 Entry라는 타입의 객체를 리턴한다.
	//이 Entry에는 단 하나의 키와 값만이 저장된다. 따라서, getKey()와 getValue()라는 메소드를 사용하면 키와 값을 간단하게 가져올 수 있다.
	public void checkHashMapEntry() {  //(646)
		HashMap<String,String> map = new HashMap<>();
		map.put("A", "a");
		map.put("B", "b");
		map.put("C", "c");
		map.put("D", "d");
		
		Set<Map.Entry<String, String>> entries = map.entrySet();  //entrySet()은 Map에 선언된 Entry라는 타입의 객체를 타입으로 지정해야된다. 리턴타입은 Set
		for(Map.Entry<String, String> tempEntry : entries) {
			System.out.println(tempEntry.getKey()+" = "+tempEntry.getValue());
		}
	}
	
	//키가 존재하는지 확인하는 containKey(), 값이 존재하는지 확인하는 containsValue() 사용 예제  리턴타입은 둘 다 boolean  (646~647)
	public void checkContains() {
		HashMap<String,String> map = new HashMap<>();
		map.put("A", "a");
		map.put("B", "b");
		map.put("C", "c");
		map.put("D", "d");
		
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsKey("Z"));
		System.out.println(map.containsValue("a"));
		System.out.println(map.containsValue("z"));
	}
	
	//remove()메소드 사용 예제(647)
	public void checkRemove() {
		HashMap<String,String> map = new HashMap<>();
		map.put("A", "a");
//		map.remove("A");
		map.put("B", "b");
		map.clear();
		System.out.println(map.size());
	}
}
