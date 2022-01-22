package guru.springframework.sfgdi.repositories;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 22/01/2022 - 13:38
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String greeting() {
        return "Hello World - EN";
    }
}
