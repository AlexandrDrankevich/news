package by.htp.ex.controller.impl;

import by.htp.ex.bean.NewUserInfo;
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

public class DoRegistration implements Command {
    UserService service = ServiceProvider.getInstance().getUserService();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter(RequestParameterName.NAME);
        String surname = request.getParameter(RequestParameterName.SURNAME);
        String email = request.getParameter(RequestParameterName.EMAIL);
        String password = request.getParameter(RequestParameterName.PASSWORD);
        String birthday = request.getParameter(RequestParameterName.BIRTHDAY);
        if (email == null || password == null || name == null || surname == null || birthday == null) {
            request.getRequestDispatcher(JspPageName.ERROR_PAGE).forward(request, response);
        }
        NewUserInfo user = new NewUserInfo();
        user.setName(name);
        user.setSurname(surname);
        user.setEmail(email);
        user.setPassword(password);
        user.setBirthday(birthday);
        try {
            boolean result = service.registration(user);
            if (result) {
                request.getRequestDispatcher(JspPageName.AUTHORIZATION_PAGE).forward(request, response);
            } else {
                request.setAttribute("massage", request.getParameter("email") + " is already exist");
                request.getRequestDispatcher(JspPageName.REGISTRATION_PAGE).forward(request, response);
            }
        } catch (ServiceException e) {
            request.getRequestDispatcher(JspPageName.ERROR_PAGE).forward(request, response);
        }
    }
}
