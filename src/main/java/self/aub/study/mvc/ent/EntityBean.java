package self.aub.study.mvc.ent;

import java.util.LinkedHashMap;
import java.util.Map;

public class EntityBean {

	private Map<String, Object> entity;

	public EntityBean() {
		this.entity = new LinkedHashMap<String, Object>();
	}

	public EntityBean(Map<String, Object> entity) {
		this.entity = entity;
	}

	@SuppressWarnings("unchecked")
	public <T> T get(Object field) {
		return (T) entity.get(field.toString());
	}

	public Map<String, Object> getEntity() {
		return entity;
	}

	public void setEntity(Map<String, Object> entity) {
		this.entity = entity;
	}

}
