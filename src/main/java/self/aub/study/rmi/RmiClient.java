package self.aub.study.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiClient {
	public static void main(String[] args) {
		System.out.println("rmi客户端开始调用");
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("rmi-client.xml");
		RmiServer rmi = (RmiServer) ctx.getBean("testRmiService");
		User sser = rmi.test();
		System.out.println("rmi调用结果：" + sser.getName());
		System.out.println("rmi客户端调用结束");
	}
}
