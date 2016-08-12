package self.aub.study.rmi;

public class RmiServerImpl implements RmiServer {

	@Override
	public User test() {
		System.out.println("调用了我--服务端 O(∩_∩)O哈！");
		User user = new User("rmi名字");
		return user;
	}

}
