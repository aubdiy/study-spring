package self.aub.study.mvc.act;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/**
 * @author liujinxin
 * @since 2015-08-27 14:16
 */
@Controller
@RequestMapping("/download")
public class FileDownload {

    @RequestMapping("tt")
    public ResponseEntity<byte[]> download() throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", "data.csv");
        return new ResponseEntity<byte[]>("你好".getBytes(),
                headers, HttpStatus.CREATED);
    }

}
