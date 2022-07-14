package by.htp.ex.controller.impl;

import by.htp.ex.controller.Command;
import by.htp.ex.controller.JspPageName;
import by.htp.ex.controller.RequestParameterName;
import by.htp.ex.service.ServiceException;
import by.htp.ex.service.ServiceProvider;
import by.htp.ex.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DoAuthorization implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService service = ServiceProvider.getInstance().getUserService();
        String login = request.getParameter(RequestParameterName.LOGIN);
        String password = request.getParameter(RequestParameterName.PASSWORD);
        try {
            boolean result = service.authorization(login, password);
            if (result) {
                request.getRequestDispatcher(JspPageName.AUTHORIZED_MAIN_PAGE).forward(request, response);
            } else {
                response.getWriter().println("WRONG EMAIL OR PASSWORD");
            }
        } catch (ServiceException e) {
            //stub

        }
    }
}
