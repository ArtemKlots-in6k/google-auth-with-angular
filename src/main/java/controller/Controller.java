package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by employee on 8/4/16.
 */
@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome() {

        return "index.jsp";
    }

}
