package self.aub.study.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisDao {
	@Resource(name = "sqlSessionReader")
	private SqlSessionTemplate sqlSessionReader;

	@Resource(name = "sqlSessionWriter")
	private SqlSessionTemplate sqlSessionWriter;

	public void inerte(MybatisEnt mybatisEnt) {
		sqlSessionWriter.insert("Mybatis.insert", mybatisEnt);
	}

	public List<MybatisEnt> selectList() {
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("id", 1);
		return sqlSessionReader.selectList("Mybatis.list", parameterMap);
	}
}
