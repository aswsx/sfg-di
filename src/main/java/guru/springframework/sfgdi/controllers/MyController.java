package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 19/01/2022 - 16:31
 */
@Controller
public class MyController {
    public String sayHello() {
        System.out.println("Hello world!!!");
        return "Hi Folks!";
    }
}
