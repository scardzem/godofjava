package study.d.collection;

import java.util.ArrayList;

@SuppressWarnings("all")  //@SuppressWarnings("unused")
public class ListSample {
	public static void main(String[] args) {
		ListSample sample=new ListSample();
        sample.setMethodTest();
    }
	
    public void checkArrayList1() {
        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<String> list1 = new ArrayList<>(100); // ArrayList의 기본 크기는 10이다. 데이터의 수가 예상 가능하면 생성자에 크기를 미리 지정할 수 있다(성능에 영향 있음).
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
    	for(String temp:list1 ) {
    		System.out.println(temp);
    	}
    }
    
    public void checkArrayList2() {
    	ArrayList<String> list = new ArrayList<>();
    	list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1,"A2");
        list.add(1,"A1");
    	for(String temp:list) {
    		System.out.println(temp);
    	}
    }
    
    public void checkArrayList3() {
    	ArrayList<String> list = new ArrayList<>();
    	list.add("A");
    	list.add("B");
    	list.add("C");
    	list.add("D");
    	list.add("E");
    	ArrayList<String> list2 = new ArrayList<>();
    	list2.add("0");
    	list2.addAll(list);  //addAll() 메소드로 Collection 객체의 모든 요소를 추가한다.
    	ArrayList<String> list3 = new ArrayList<>(list);  //생성자에 Collection객체를 매개변수로 넣으면 기존 객체를 복사하여 생성할 수 있다.
    	ArrayList<String> list4 = new ArrayList<>();
    	for(String temp : list3) {
    		System.out.println("생성자로 list 복사 : "+temp);
    	}
    	for(String temp : list2) {
    		System.out.println("addAll() 메소드로 list 추가 : " + temp);
    	}
    	System.out.println("list : "+list.hashCode());
    	System.out.println("list2 : "+list2.hashCode());
    	System.out.println("list3 : "+list3.hashCode());
    	if(list == list4) {
    		System.out.println("같은 객체");
    	} else {
    		System.out.println("다른 객체");
    	}
    }

    public void checkArrayList4() {
    	ArrayList<String> list = new ArrayList<>();
    	list.add("A");
    	
    	ArrayList<String> list2 = new ArrayList<>();
    	list.add("Hello");
    	list2 = list;	//이렇게 대입연산자를 사용하면 주소값이 대입되기 때문에 list2와 list1이 같은 객체가 된다. 그래서 list1에 값을 추가해도 list2에도 추가된 것.
    					//ArrayList 객체를 만들 때 기존 값을 추가하려면 addAll()을 사용하기를 권장(자바의 신 601페이지)
    	for(String temp : list2) {
    		System.out.println(temp);
    	}
    	
    }
    
    public void checkArrayList5() {
    	ArrayList<String> list = new ArrayList<>();
    	list.add("A");
    	list.add("B");
    	int listSize = list.size();
    	for(int i=0; i<listSize; i++) {
    		System.out.println("list.get("+i+") = "+list.get(i));
    	}
    }
    
    public void checkArrayList6() {
    	ArrayList<String> list = new ArrayList<String>();
    	list.add("A");
    	list.add("B");
    	String[] strList = list.toArray(new String[0]);  //toArray(T[] a) 메소드 사용 예제 매개변수로 넘겨주는 배열의 크기는 0으로 하는 것이 좋다고 하는듯.(603페이지)
    	for(String temp : list) {
    		System.out.println(temp);
    	}
    }
    
    //6번 메소드에 대한 설명을 위한 예제
    public void checkArrayList7() {
    	ArrayList<String> list = new ArrayList<String>();
    	list.add("A");
    	list.add("B");
    	list.add("C");
        String[] tempArray = new String[0]; // 1) tempArray의 크기를 3보다 더 크게 하면 list.toArray(tempArray)로 배열을 만들면 null값이 자동으로 들어가게 된다. (3보다 작아도 자동으로 list의 크기만큼 추가된다.) 
        String[] strList = list.toArray(tempArray); // 2)
        for(String temp : strList) { // 3)
    		System.out.println(temp);
    	}
    }

    //ArrayList에 있는 데이터 삭제하는 예제
    public void checkArrayList8() {
    	ArrayList<String> list = new ArrayList<String>();
    	list.add("A");
    	list.add("B");
    	list.add("C");
    	list.add("A");
//    	System.out.println("Removed " + list.remove(0));
//    	System.out.println(list.remove("A"));  //remove()메소드 리턴타입 : boolean, 매개변수의 값과 같은 값 중 첫번째 값을 삭제한다.
    	ArrayList<String> temp = new ArrayList<String>();  //removeAll()을 사용하기 위해 Collection(의 ArrayList) 객체 생성
    	temp.add("A");
    	list.removeAll(temp);  //removeAll()의 리턴타입은 void, 매개변수로 받은 Collection 객체와 값이 같은 모든 데이터를 삭제한다.
    	for(int i=0; i<list.size(); i++) {
    		System.out.println("list.get("+i+") = " + list.get(i));
    	}
    }
    
    public void setMethodTest() {
    	ArrayList<String> list = new ArrayList<String>();
    	list.add("A");
    	list.add("B");
    	list.add("C");
    	
    	System.out.println("기존값 : "+list.set(1, "A"));
    	for(String temp : list) {
    		System.out.println(temp);
    	}
    }
}
