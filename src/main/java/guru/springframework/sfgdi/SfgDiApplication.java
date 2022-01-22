package guru.springframework.sfgdi;

import guru.springframework.sfgdi.config.SfgConfiguration;
import guru.springframework.sfgdi.config.SfgConstructorConfig;
import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.services.PrototypeBean;
import guru.springframework.sfgdi.services.SingletonBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {
    private static final Logger LOG = LoggerFactory.getLogger(SfgDiApplication.class.getName());

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        PetController petController = ctx.getBean("petController", PetController.class);
       LOG.warn("The Best Pet is:");
       LOG.warn(petController.whichPetIsTheBest());

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
       LOG.warn(i18nController.sayHello());

        MyController myController = (MyController) ctx.getBean("myController");
       LOG.warn("-------------- PRIMARY Bean");
       LOG.warn(myController.sayHello());

       LOG.warn("-------------Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
                .getBean("propertyInjectedController");
       LOG.warn(propertyInjectedController.getGreeting());

       LOG.warn("------------Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx
                .getBean("setterInjectedController");
       LOG.warn(setterInjectedController.getGreeting());

       LOG.warn("------------Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx
                .getBean("constructorInjectedController");
       LOG.warn(constructorInjectedController.getGreeting());

       LOG.warn("-------------Bean Scopes-------------");
        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
       LOG.warn(singletonBean1.getMyScope());
        SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
       LOG.warn(singletonBean2.getMyScope());

        PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
       LOG.warn(prototypeBean1.getMyScope());
        PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
       LOG.warn(prototypeBean2.getMyScope());

       LOG.warn("--------Fake Data Source------------");
        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
       LOG.warn(fakeDataSource.getUsername());
       LOG.warn(fakeDataSource.getPassword());
       LOG.warn(fakeDataSource.getJdbcurl());

       LOG.warn("-----------Config Props Bean ------------");
        SfgConfiguration sfgConfiguration = ctx.getBean(SfgConfiguration.class);
       LOG.warn(sfgConfiguration.getUsername());
       LOG.warn(sfgConfiguration.getPassword());
       LOG.warn(sfgConfiguration.getJdbcurl());

       LOG.warn("----------Constructor Binding------------");
        SfgConstructorConfig sfgConstructorConfig = ctx.getBean(SfgConstructorConfig.class);
       LOG.warn(sfgConstructorConfig.getUsername());
       LOG.warn(sfgConstructorConfig.getPassword());
       LOG.warn(sfgConstructorConfig.getJdbcurl());
    }
}
