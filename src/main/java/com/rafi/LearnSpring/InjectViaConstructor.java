package com.rafi.LearnSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectViaConstructor {
    private MyServices myServices;
    
    @Autowired
    // constructor
    public InjectViaConstructor (MyServices myServices) {
        this.myServices = myServices;
    }

    public void getMessage() {
        myServices.sayHello1();
    }
}
