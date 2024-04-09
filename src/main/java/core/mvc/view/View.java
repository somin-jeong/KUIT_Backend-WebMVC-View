package core.mvc.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public interface View {
    void render(HttpServletRequest request, HttpServletResponse response) throws Exception;
}