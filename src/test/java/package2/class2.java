package package2;

import org.testng.annotations.Test;

public class class2 {
	@Test(groups="group1")
	public void method4(){
		System.out.println("package2-class2-method4");
	}
	
	@Test
	public void method5(){
		System.out.println("package2-class2-method5");
	}
}
