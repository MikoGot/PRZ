package com.watkings.service;


import com.watkings.dto.LoggedUser;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserLoginService {


    public boolean loginByFacebook(final String token){
        return checkFacebookToken(token);
    }

    private boolean checkFacebookToken(String token){
        RestTemplate restTemplate = new RestTemplate();
        LoggedUser loggedUser = restTemplate.getForObject("https://graph.facebook.com/me?access_token="+token, LoggedUser.class);
        return loggedUser != null;
    }
}
