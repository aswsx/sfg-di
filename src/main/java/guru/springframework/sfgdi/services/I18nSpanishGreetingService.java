package guru.springframework.sfgdi.services;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 19/01/2022 - 19:00
 */
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
