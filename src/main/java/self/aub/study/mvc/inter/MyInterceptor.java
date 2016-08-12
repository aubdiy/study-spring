package self.aub.study.mvc.inter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {

	private static final Logger LOG = LoggerFactory.getLogger(MyInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse rep, Object obj) throws Exception {
		LOG.debug("preHandle");
		LOG.debug("RequestURL : {}", req.getRequestURL());
		LOG.debug("RequestURI : {}", req.getRequestURI());
		LOG.debug("ContextPath : {}", req.getContextPath());
		LOG.debug("ServletPath : {}", req.getServletPath());
		LOG.debug("getPathInfo : {}", req.getPathInfo());
		if ("/inter/false".equals(req.getRequestURI())) {
			req.setAttribute("message", "from interceptor");
			rep.sendRedirect("/index");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse rep, Object obj, ModelAndView mav)
			throws Exception {
		LOG.debug("postHandle");

	}

	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse rep, Object obj, Exception exc)
			throws Exception {
		// rep.setStatus(500);
		// rep.setContentType("application/json");
		// rep.getOutputStream().
		// rep.getOutputStream().write("{'a':1}".getBytes());
		// rep.flushBuffer();
		// LOG.debug("afterCompletion :", exc);
	}
}
