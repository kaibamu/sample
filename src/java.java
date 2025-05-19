import java.util.ArrayList;
import java.util.Collections;
public class java {
    public static void main(String... args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);
        //  以下にコードを追加
        Collections.sort(numbers);
        
        System.out.println(numbers);
    


        


    
        ArrayList<String> members = new ArrayList<>();
        members.add("kirishima");
        members.add("midorikawa");
        members.add("rokumura");
        // 以下にコードを追加
        Collections.sort(members);
        ArrayList<String> copy = new ArrayList<>(members);
        copy.add("nara");
        
        System.out.println(members);
        System.out.println(copy);
        
        
        
        ArrayList<String> fruits1 = new ArrayList<>();
        fruits1.add("apple");
        fruits1.add("banana");
        fruits1.add("orange");
        
        ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.add("grape");
        fruits2.add("kiwi");
        fruits2.add("melon");
        Collections.sort(fruits1);
       // ArrayList<String> copy = new ArrayList<>(fruits1);
       // copy.add(fruits2);
        
        //  ここに2 つのリストを結合し、ソートするコードを追加
        
        
        //  出力結果: [apple, banana, grape, kiwi, melon, orange]
        System.out.println(copy);
    
        
        
    }}
