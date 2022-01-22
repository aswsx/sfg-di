package guru.springframework.sfgdi.services;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 19/01/2022 - 18:58
 */
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
