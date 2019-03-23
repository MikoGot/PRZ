package com.watkings.controller;

import com.watkings.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserAuthController {
    // TO DO

    @Autowired
    private UserLoginService userLoginService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/login/facebook{token}", method = RequestMethod.POST)
    public boolean loginByFacebook( @PathVariable String token) {
        return userLoginService.loginByFacebook(token);
    }

}
