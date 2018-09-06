package animals;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("default_context.xml");

        Cat cat = context.getBean("cat", Cat.class);

        System.out.println(cat.getFood());
        cat.eat();
        cat.makeASound();

        Cat otherCat = context.getBean("cat", Cat.class);

        System.out.println("Is this cat the same as the other cat? "
                + "\nThe answer is: " + cat.equals(otherCat));


        context.close();
    }
}
