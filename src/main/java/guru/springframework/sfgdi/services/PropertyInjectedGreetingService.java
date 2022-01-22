package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 19/01/2022 - 18:25
 */
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World --- Property";
    }
}
