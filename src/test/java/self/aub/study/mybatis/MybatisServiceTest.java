package self.aub.study.mybatis;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import self.aub.study.UnitBase;
import self.aub.study.mybatis.MybatisService;

@ContextConfiguration(locations = { "/spring-mybatis-test.xml" })
public class MybatisServiceTest extends UnitBase {

	@Autowired
	private MybatisService mybatisService;

	@Test
	public void testInerteFail() {
		mybatisService.inerteFail();
	}

	@Test
	public void testInerteSucess() {
		mybatisService.inerteSucess();
	}
}
