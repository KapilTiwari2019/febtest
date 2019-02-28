package runTimePolymorphims;

public class Rob extends person {

	// ----  1 ---
	
	public void dance() {
		System.out.println("He is a good dancer");
	}
 public void son() {
	 System.out.println("He is a son of ABC");	 
 }
 public static void main(String[] args) {
	 Rob objs = new Rob ();
	 
	 objs.student();
		objs.player();
		objs.dance();
		objs.son();
			
	 
}
}
