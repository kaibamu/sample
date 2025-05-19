
import java.util.ArrayList;
import java.util.Collections;
public class java3 {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(8);
		numbers.add(1);
		numbers.add(3);
		Collections.sort(numbers);

		System.out.println(numbers);



		ArrayList<String> members = new ArrayList<>();
		members.add("kirishima");
		members.add("midorikawa");
		members.add("rokumura");
		ArrayList<String> members_copy = new ArrayList<>();	
		members_copy.addAll(members);
		members_copy.add("nara");		

		System.out.println("members：" + members);
		System.out.println("members_copy：" + members_copy);
		
		
		
		ArrayList<String> fruits1 = new ArrayList<>();
		fruits1.add("apple");
		fruits1.add("banana");
		fruits1.add("orange");

		ArrayList<String> fruits2 = new ArrayList<>();
		fruits2.add("grape");
		fruits2.add("kiwi");
		fruits2.add("melon");

		
		ArrayList<String> combinedFruits = new ArrayList<>(fruits1);
		combinedFruits.addAll(fruits2);
		Collections.sort(combinedFruits);

		System.out.println(combinedFruits);
		}
}
