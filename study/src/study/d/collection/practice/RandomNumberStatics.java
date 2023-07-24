package study.d.collection.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatics {
	
	private Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();

	public static void main(String[] args) {
		RandomNumberStatics sample = new RandomNumberStatics();
		sample.getRandomNumberStatistics();
	}

	public void getRandomNumberStatistics() {
		Random random = new Random();
		for (int loop = 0; loop < 5000; loop++) {
			int tempNumber = random.nextInt(50) + 1;
			putCurrentNumber(tempNumber);
		}
		printStatistics();
	}

	public void putCurrentNumber(int tempNumber) {
		if (hashtable.containsKey(tempNumber)) {
			hashtable.put(tempNumber, hashtable.get(tempNumber) + 1);  //hashtable의 key를 난수로 받고, 해당 key에 해당하는 값으로 +1을 더해서 값을 변화시키는 부분. 값은 해당 난수가 발생한 횟수를 말한다.
		} else {
			hashtable.put(tempNumber, 1);
		}
	}

	public void printStatistics() {
		Set<Integer> keySet = hashtable.keySet();
		for (int key : keySet) {
			int count = hashtable.get(key);
			System.out.print(key + "=" + count + "\t");
			if (key % 10 - 1 == 0)
				System.out.println();
		}
	}

}
