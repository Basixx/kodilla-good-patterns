package com.kodilla.good.patterns.challenges.two;

import com.kodilla.good.patterns.challenges.two.auxiliary.InformationService;

public class UserInformation implements InformationService {
    public void inform(User user){
        System.out.println("Message sent to: "+user.getName() + " "+ user.getSurName());
    }
}
