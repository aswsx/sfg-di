package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 22/01/2022 - 14:54
 */
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton bean!!!");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }


}
