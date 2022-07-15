package by.htp.ex.controller.impl;

import by.htp.ex.controller.Command;
import by.htp.ex.controller.JspPageName;
import by.htp.ex.controller.RequestParameterName;
import by.htp.ex.service.ServiceException;
import by.htp.ex.service.ServiceProvider;
import by.htp.ex.service.UserService;
import by.htp.ex.util.validation.UserDataValidation;
import by.htp.ex.util.validation.ValidationProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DoAuthorization implements Command {
    UserService service = ServiceProvider.getInstance().getUserService();
    UserDataValidation userDataValidation = ValidationProvider.getInstance().getUserDataValidation();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter(RequestParameterName.LOGIN);
        String password = request.getParameter(RequestParameterName.PASSWORD);
        if(login==null||password==null){
            request.getRequestDispatcher(JspPageName.ERROR_PAGE).forward(request, response);
        }
        try {
                      boolean result = service.authorization(login, password);
            if (result) {
                request.getRequestDispatcher(JspPageName.AUTHORIZED_MAIN_PAGE).forward(request, response);
            } else {
                request.setAttribute("massage", "Incorrect login or password");
                request.getRequestDispatcher(JspPageName.AUTHORIZATION_PAGE).forward(request, response);
            }
        } catch (ServiceException e) {
            request.getRequestDispatcher(JspPageName.ERROR_PAGE).forward(request, response);
        }
    }
}
