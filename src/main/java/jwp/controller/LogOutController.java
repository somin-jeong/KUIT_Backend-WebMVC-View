package jwp.controller;

import core.mvc.Controller;
import core.mvc.ModelAndView;
import core.mvc.view.JspView;
import core.mvc.view.View;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LogOutController implements Controller {
    @Override
    public ModelAndView execute(HttpServletRequest req) {
        HttpSession session = req.getSession();
        session.removeAttribute("user");
        return new ModelAndView(new JspView(REDIRECT + "/"));
    }
}