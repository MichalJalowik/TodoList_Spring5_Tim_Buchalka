package academy.learnprogramming.config.controller;


import academy.learnprogramming.config.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    @Autowired
    DemoService demoService;

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }


//    @GetMapping("welcome")
//    public String welcome(Model model){
//        model.addAttribute("user", "Tim");
//        log.info("model={}", model);
//        //prefix + name + suffix
//        //WEB-INF/view/welcome.jsp
//        return "welcome";
//    }

        @GetMapping("welcome1")
    public String welcome(@RequestParam String user, @RequestParam int age, Model model){
        model.addAttribute("user", demoService.getHelloMessage(user));
        model.addAttribute("age", age);
        log.info("model={}", model);
        //prefix + name + suffix
        //WEB-INF/view/welcome.jsp
        return "welcome";
    }


    @ModelAttribute("welcomeMessage")
    public String welcomeMessages(){
        log.info("welcomeMessage() called");
        return demoService.getWelcomeMessage();

    }




}
