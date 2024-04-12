package jwp.controller;

import core.db.MemoryUserRepository;
import core.mvc.Controller;
import core.mvc.ModelAndView;
import core.mvc.view.JspView;
import core.mvc.view.View;
import jwp.util.UserSessionUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

public class ListUserController extends AbstractController {
    HttpSession session;
    @Override
    public void setSession(HttpSession httpSession) {
        this.session = httpSession;
    }
    @Override
    public ModelAndView execute(Map<String, String> params) {
        if(UserSessionUtils.isLogined(session)){
            ModelAndView modelAndView = jspView("/user/list.jsp");
            modelAndView.addObject("users", MemoryUserRepository.getInstance().findAll());
            return modelAndView;
        }
        return jspView(REDIRECT + "/user/loginForm");
    }
}
