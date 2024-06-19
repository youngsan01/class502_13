package member.services;

import global.exceptions.ValidationException;
import global.validators.Validator;
import jakarta.servlet.http.HttpServletRequest;
import member.validators.LoginValidator;
import member.validators.Mailer;
import org.junit.jupiter.api.Test;

public class LoginService {
    private Validator<HttpServletRequest> validator;
    private Mailer mailer;

    public void setMailer(Mailer mailer) {
        this.mailer = mailer;
    }

    public LoginService(Validator<HttpServletRequest> validator) {
        this.validator = validator;
    }

    public void process(HttpServletRequest request) {
        validator.check(request);




        // 로그인 성공 가정
        // 성공시 메일 전송
        if (mailer != null) {
            String email = request.getParameter("email");
            mailer.send(email);
        }

    }
}

