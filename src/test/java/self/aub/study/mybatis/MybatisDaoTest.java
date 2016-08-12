package self.aub.study.mybatis;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import self.aub.study.UnitBase;
import self.aub.study.mybatis.MybatisDao;
import self.aub.study.mybatis.MybatisEnt;

@ContextConfiguration(locations = { "/spring-mybatis-test.xml" })
public class MybatisDaoTest extends UnitBase {
	@Autowired
	private MybatisDao mybatisDao;

	@Test
	public void testInsert() {
		MybatisEnt mybatisEnt = new MybatisEnt();
		mybatisEnt.setName("abc");
		mybatisDao.inerte(mybatisEnt);
	}

	@Test
	public void testSelect() {
		List<MybatisEnt> selectList = mybatisDao.selectList();
		assertNotNull(selectList);
	}
}
