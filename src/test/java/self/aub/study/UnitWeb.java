package self.aub.study;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring-servlet-test.xml" })
public class UnitWeb extends Assert {

	protected MockHttpServletRequest request;
	protected MockHttpServletResponse response;

	@Autowired
	private RequestMappingHandlerMapping handlerMapping;
	@Autowired
	private RequestMappingHandlerAdapter handlerAdapter;

	@Before
	public void before() {
		request = new MockHttpServletRequest();
		response = new MockHttpServletResponse();
	}

	protected ModelAndView request() {
		try {
			final HandlerExecutionChain chain = handlerMapping.getHandler(request);
			return handlerAdapter.handle(request, response, chain.getHandler());
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView();
		}
	}
}
