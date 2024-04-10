package core.mvc;

import core.mvc.view.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Controller {
    static final String REDIRECT = "redirect:";
    ModelAndView execute(HttpServletRequest req, HttpServletResponse resp) throws IOException;
}