package package1;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class class1 {
	@BeforeSuite
	public void testBeforeSuite(){
		System.out.println("testBeforeSuite-----------");
	}
	
	@Test(groups={"group1","group2"})
	public void method1(){
		System.out.println("package1-class1-method1");
	}
	
	@Test
	public void method2(){
		System.out.println("package1-class1-method2");
	}
	
	@Test
	public void method3(){
		System.out.println("package1-class1-method3");
	}
	
}
