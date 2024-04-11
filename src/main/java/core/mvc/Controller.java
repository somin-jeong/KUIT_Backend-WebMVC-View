package core.mvc;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public interface Controller {
    static final String REDIRECT = "redirect:";
    ModelAndView execute(HttpServletRequest req) throws IOException;
}