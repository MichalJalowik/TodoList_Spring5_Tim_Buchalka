package academy.learnprogramming.config.service;

import org.springframework.stereotype.Service;

//moze byc tez controller (service jest bardziej precyzyjny)
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String getHelloMessage(String user) {
        return "Hello" + user;
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to the Demo App 2";
    }
}
