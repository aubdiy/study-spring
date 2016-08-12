package self.aub.study.rmi;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;

	public User(String name) {
		this.name = name;
	}

	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

}
