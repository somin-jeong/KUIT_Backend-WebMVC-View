package core.mvc;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

public interface Controller {
    static final String REDIRECT = "redirect:";
    ModelAndView execute(Map<String, String> params) throws IOException;
    default void setSession(HttpSession httpSession) {};
}