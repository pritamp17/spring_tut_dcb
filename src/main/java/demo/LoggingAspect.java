package demo;

import org.junit.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
public class LoggingAspect {
    @Before("executiom(* demo.ShoppingCart.checkout())")
    public void logger(){
        System.out.println("Loggers");
    }
}
