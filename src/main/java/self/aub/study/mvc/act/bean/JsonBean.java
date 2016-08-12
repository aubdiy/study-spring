package self.aub.study.mvc.act.bean;

import java.io.Serializable;

public class JsonBean implements Serializable {
	private static final long serialVersionUID = -1785532161273568658L;

	private int i;
	private String s;

	public JsonBean() {
	}

	public JsonBean(int i, String s) {
		this.i = i;
		this.s = s;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

}
