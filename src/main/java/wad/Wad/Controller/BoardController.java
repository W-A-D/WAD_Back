package wad.Wad.Controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BoardController {

    @PostMapping("/board")
    public String board(HttpServletRequest request) {

        String refresh = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("refresh")) {
                    refresh = cookie.getValue();
                    break;
                }
            }
        }

        if (refresh != null) {

            return "Hello";
        } else {
            // refresh 토큰이 존재하지 않으면 "No refresh token" 반환
            return "No refresh token";
        }
    }
}
