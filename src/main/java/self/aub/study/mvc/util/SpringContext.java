package self.aub.study.mvc.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * <B>Spring Context</B><br>
 * 
 * @author liujinxin
 */
@Component
public final class SpringContext implements ApplicationContextAware {
	private static ApplicationContext ac;

	@Override
	public void setApplicationContext(ApplicationContext appContext) throws BeansException {
		ac = appContext;
	}

	public static Object get(String name) {
		return ac.getBean(name);
	}
	

	public static Object getBean(String name, Object... args) {
		return ac.getBean(name, args);
	}

	public static <T> T get(Class<T> requiredType) {
		return ac.getBean(requiredType);
	}

	public static <T> T get(String name, Class<T> requiredType) {
		return ac.getBean(name, requiredType);
	}
}