package me.chocho.choawsapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login")
    public void login() {
        log.info("in login");
    }

    @PostMapping("/loginCallback")
    @ResponseBody
    public String loginCallback(@RequestBody String body) {
        log.info("in body");
        log.info(body);

        return body;
    }

    @GetMapping("/loginOut")
    public void logout() {
        log.info("in logout");
    }
}
