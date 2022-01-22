package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 22/01/2022 - 14:59
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("!!!Creating a Prototype bean!!!");
    }

    public String getMyScope() {
        return "I'm a Prototype";
    }
}
