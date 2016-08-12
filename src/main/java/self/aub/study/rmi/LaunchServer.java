package self.aub.study.rmi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchServer {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("rmi服务端启动");
		new ClassPathXmlApplicationContext("rmi-server.xml");
		System.out.println("rmi服务端启动完成。。。");
	}
}
