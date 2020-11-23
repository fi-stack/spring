package com.rafi.LearnSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectViaSetter {
    private MyServices myServices;

    @Autowired
    // setter
    public void setMyServices(MyServices myServices) {
        this.myServices = myServices;
    }

    public void getMessage() {
        myServices.sayHello2();
    }
}
