package edu.wctc.springbootassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tutorials")
public class TutorialController {
    @GetMapping("/first")
    public String getTutorial1(){
        return "tutorial-page1";
    }
    @GetMapping("/second")
    public String getTutorial2(){
        return "tutorial-page2";
    }
    @GetMapping("/third")
    public String getTutorial3(){
        return "tutorial-page3";
    }
}
