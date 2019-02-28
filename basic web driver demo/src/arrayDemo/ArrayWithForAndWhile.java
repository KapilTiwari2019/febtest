package arrayDemo;

public class ArrayWithForAndWhile {
	public static void main(String[] args) {
		
		int member [] = new int[5];
		
		member[0]= 123;
		member[1]= 432;
		member[2]= 342;
		member[3]= 231;
		
		int sizeofArray = member.length;
		System.out.println(">>"+sizeofArray);
		
		
	
	for( int i = 0; i < sizeofArray; i++) {
			System.out.println("i value ="+member[i]);
		}
		
		//advance for loop
		for(int i :member) {
			System.out.println(">>"+i);
		}
		
		int i = 0; while (i<5){
			System.out.println(i+">>"+member[i]);
			i++;
		}
		
		
	}

}
