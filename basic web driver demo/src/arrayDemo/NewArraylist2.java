package arrayDemo;

import java.util.ArrayList;


public class NewArraylist2 {
public static void main(String[] args) {
	
	ArrayList<String> sports = new ArrayList<String>();
	
	sports.add("Soccer");
	sports.add("Tennis");
	sports.add("B.ball");
	sports.add("Swimming");
	sports.add("Football");	
	
	
	int listsize = sports.size();
	System.out.println("List size = "+listsize);
	
	for(int i= 0; i<listsize; i++) {
	System.out.println("Sports = "+ sports.get(i));
	
}
	
}}
