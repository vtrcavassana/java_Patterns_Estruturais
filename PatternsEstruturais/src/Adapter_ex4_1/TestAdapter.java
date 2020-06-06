package Adapter_ex4_1;

import java.util.Map;

public class TestAdapter {

	public static void main(String[] args) {

		Integer[][] matrizHashMap = new Integer[][] {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}};
		Integer[][] matrizTreeMap = new Integer[][] {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}};

		Map<Integer, Integer> HashMapTest = new HashMapAdapter<Integer>(matrizHashMap);
		
		System.out.println("HashMap");
		
		for (Integer key: HashMapTest.keySet()) {
			System.out.println(key + " = " + HashMapTest.get(key));
		}
		
		Map<Integer, Integer> TreeMapTest = new TreeMapAdapter<Integer>(matrizTreeMap);
		
		System.out.println("\nTreeMap:");
		
		for (Integer key: TreeMapTest.keySet()) {
			System.out.println(key + " = " + TreeMapTest.get(key));
		}
	}
}