package self.aub.study.tra;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TraDao {
	private static final Logger LOG = LoggerFactory.getLogger(TraDao.class);
	private static final String LOG_SQL = "sql : {}";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insert(String name) {
		String sql = "INSERT INTO sys_user VALUE(?, ?, ?, ?, ?, ?, ?)";
		LOG.debug(LOG_SQL, sql);
		jdbcTemplate.update(sql, null, name, null, null, null, null, null);
	}

	public void insertException(String name) {
		throw new RuntimeException("insert fail");
	}

	public void flush() {
		String sql = "truncate table sys_user";
		jdbcTemplate.execute(sql);
	}
}
