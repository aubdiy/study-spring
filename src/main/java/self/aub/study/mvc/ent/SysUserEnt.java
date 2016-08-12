package self.aub.study.mvc.ent;

public enum SysUserEnt {
	id("id"), loginName("loginName"), password("password"), nickName("nickName"), qq("qq"), createTime("createTime"), age("age");

	private final String fieldName;

	private SysUserEnt(String fieldName) {
		this.fieldName = fieldName;
	}

	@Override
	public String toString() {
		return fieldName;
	}

}
