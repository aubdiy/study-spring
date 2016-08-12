package self.aub.study.mvc.act;

import java.io.InputStream;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;

@Controller
@RequestMapping("/upload")
public class FileUploadAct {

	@RequestMapping()
	public String index(ModelMap mm) {
		mm.put("message", "File Upload index");
		return "upload";
	}

	@RequestMapping("single")
	public String single(HttpServletRequest req, ModelMap mm) throws Exception {
		final StringBuilder sb = new StringBuilder("Upload single");
		Part part = null;
		part = req.getPart("a");
		sb.append("<br/>getName : ").append(part.getName());
		final InputStream is = part.getInputStream();
		final byte[] bytes = new byte[is.available()];
		is.read(bytes);
		sb.append("<br/>getValue : ").append(new String(bytes));
		sb.append("<br/>getContentType : ").append(part.getContentType());

		part = req.getPart("file");
		sb.append("<br/>getName : ").append(part.getName());
		sb.append("<br/>getContentType : ").append(part.getContentType());

		mm.put("message", sb.toString());
		return "upload";
	}

	@RequestMapping("multi")
	public String multi(HttpServletRequest req, ModelMap mm) throws Exception {
		final Collection<Part> parts = req.getParts();
		final StringBuilder sb = new StringBuilder("Upload multi");
		for (Part part : parts) {
			sb.append("<br/>");
			sb.append("<br/>getName : ").append(part.getName());
			sb.append("<br/>getContentType : ").append(part.getContentType());
		}
		mm.put("message", sb.toString());
		return "upload";
	}

	@RequestMapping("s-multi")
	public String springSingle(@RequestPart Part file1, ModelMap mm) {
		final StringBuilder sb = new StringBuilder("upload s-multi");
		sb.append("<br/>getName : ").append(file1.getName());
		sb.append("<br/>getContentType : ").append(file1.getContentType());
		mm.put("message", sb.toString());

		return "upload";
	}

}
