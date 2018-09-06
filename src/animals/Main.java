package animals;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("default_context.xml");

        Cat cat = context.getBean("cat", Cat.class);

        System.out.println(cat.getFood());
        cat.eat();
        cat.makeASound();
    }
}
