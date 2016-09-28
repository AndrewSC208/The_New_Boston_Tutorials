package test;
import java.util.ArrayList;
import java.util.Collections;

public class test {
  public static void main(String args[]) {
	
	// create array list:
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    // fill list1:
    for (int i = 1; i <= 3; i++) {
    	list1.add(i);
    }
    // fill list2:
    for (int i = 4; i <= 11; i++) {
    	list2.add(i);
    }
    
    // shuffle the numbers:
    Collections.shuffle(list1);
    Collections.shuffle(list2);
    
    // typecast to an array from array list:
    int[] num1 = new int[list1.size()];
    int[] num2 = new int[list2.size()];
    
    // fill array:
    for (int i = 0; i < list1.size(); i++) {
    	num1[i] = list1.get(i);
    }
    for (int i = 0; i < list2.size(); i++) {
    	num2[i] = list2.get(i);
    }
    
    // print out the two array's:
    for (int i = 0; i < num1.length; i++) {
      System.out.println(num1[i]);
    }
    for (int i = 0; i < num2.length; i++) {
        System.out.println(num2[i]);
    }
  }
}
