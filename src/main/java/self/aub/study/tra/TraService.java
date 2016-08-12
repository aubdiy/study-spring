package self.aub.study.tra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TraService {

	@Autowired
	private TraDao traDao;

	public void flush() {
		traDao.flush();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void requiredOK() {
		traDao.insert("required_Ok_1");
		traDao.insert("required_Ok_2");
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void requiredFail() {
		traDao.insert("required_Ok_3");
		traDao.insertException("required_Ok_4");
	}

}
