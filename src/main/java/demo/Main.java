package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        /*
//        ApplicationContext context=
//                new ClassPathXmlApplicationContext("spring.xml");   // 1

//        Nurse nurse = context.getBean(Nurse.class);
//        Doctor doctor = (Doctor) context.getBean("doctor");
//
//        nurse.assist();

//        Doctor staff = context.getBean(Doctor.class);
//        staff.assist();
//        System.out.println(staff.getQualifiction());
        1 tut
        */
        ApplicationContext context=
                new AnnotationConfigApplicationContext(BeanConfig.class);

        ShoppingCart cart = context.getBean(ShoppingCart.class);
        cart.checkout();
    }
}
