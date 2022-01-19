package guru.springframework.sfgdi.services;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 19/01/2022 - 17:16
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
