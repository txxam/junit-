package bao2;

import org.junit.Assert;
import org.junit.Test;

    public class OperationTest2 {
   /*��public�����࣬ �޲Σ� �޷���ֵ*/
	@Test
	public void Testadd(){
		//ʵ������Ķ���
		Operation o=new Operation ();
		//ͨ��ʵ�����������
		int result=o.add(1,2);
		//���Է��ؽ��
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
