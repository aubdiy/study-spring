package self.aub.study.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MybatisService {

	@Autowired
	private MybatisDao mybatisDao;

	@Transactional(propagation = Propagation.REQUIRED)
	public void inerteSucess() {
		MybatisEnt mybatisEnt1 = new MybatisEnt();
		mybatisEnt1.setName("abc1");
		mybatisDao.inerte(mybatisEnt1);
		MybatisEnt mybatisEnt2 = new MybatisEnt();
		mybatisEnt2.setName("abc2");
		mybatisDao.inerte(mybatisEnt2);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void inerteFail() {
		MybatisEnt mybatisEnt1 = new MybatisEnt();
		mybatisEnt1.setName("abc3");
		mybatisDao.inerte(mybatisEnt1);

		MybatisEnt mybatisEnt2 = new MybatisEnt();
		mybatisEnt2.setName("abc4");
		mybatisDao.inerte(mybatisEnt2);
		throw new RuntimeException();
	}
}
