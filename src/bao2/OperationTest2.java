package bao2;

import org.junit.Assert;
import org.junit.Test;

    public class OperationTest2 {
   /*用public修饰类， 无参， 无返回值*/
	@Test
	public void Testadd(){
		//实例化类的对象
		Operation o=new Operation ();
		//通过实例化对象测试
		int result=o.add(1,2);
		//测试返回结果
		System.out.println(result);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void Testsub(){
		Operation o=new Operation ();
		int result=o.sub(3,2);
		//System.out.println(result);
		Assert.assertEquals(1, result);
	}
}
