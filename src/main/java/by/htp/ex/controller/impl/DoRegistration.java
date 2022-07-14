package by.htp.ex.controller.impl;

import by.htp.ex.bean.NewUserInfo;
import by.htp.ex.controller.Command;
import by.htp.ex.controller.JspPageName;
import by.htp.ex.service.ServiceException;
import by.htp.ex.service.ServiceProvider;
import by.htp.ex.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DoRegistration implements Command {
    UserService service = ServiceProvider.getInstance().getUserService();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        NewUserInfo user = new NewUserInfo();
        user.setName(request.getParameter("name"));
        user.setSurname(request.getParameter("surname"));
        user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("password"));
        user.setBirthday(request.getParameter("birthday"));

        try {
            boolean result = service.registration(user);
            if (result) {
                request.getRequestDispatcher(JspPageName.AUTHORIZATION_PAGE).forward(request, response);
            } else {
                request.getRequestDispatcher(JspPageName.REGISTRATION_PAGE).forward(request, response);
            }
        } catch (ServiceException e) {
            request.getRequestDispatcher(JspPageName.ERROR_PAGE).forward(request, response);
        }
    }
}
