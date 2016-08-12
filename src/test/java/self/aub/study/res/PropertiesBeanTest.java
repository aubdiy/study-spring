package self.aub.study.res;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import self.aub.study.UnitBase;
import self.aub.study.res.PropertiesBean;

@ContextConfiguration(locations = { "/spring-properties-test.xml" })
public class PropertiesBeanTest extends UnitBase {

	@Autowired
	private PropertiesBean propertiesBean;

	@Test
	public void test() {
		String name = propertiesBean.getName();
		System.out.println(name);
	}
}
