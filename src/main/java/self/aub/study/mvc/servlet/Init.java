package self.aub.study.mvc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import self.aub.study.mvc.act.bean.AA;
import self.aub.study.mvc.util.SpringContext;

@SuppressWarnings("serial")
public class Init extends HttpServlet {
	@Override
	public void init() throws ServletException {
		SpringContext.get(AA.class).tt();
	}
}
