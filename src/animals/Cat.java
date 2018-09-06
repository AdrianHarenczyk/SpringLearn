package animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
class Cat implements Animal {

    @Qualifier("fishFood")
    @Autowired
    private Food food;

    public Cat(Food food) {
        this.food = food;
    }

    public Cat() {
        this.food = new CatFood();
    }

    @PostConstruct
    private void init() {
        System.out.println("Cat creation completed.");
    }

    @PreDestroy
    private void destroyCat() {
        System.out.println("cat is falling to the void...");
    }

    @Override
    public void makeASound() {
        System.out.println("meow...");
    }

    @Override
    public void eat() {
        System.out.println("Eating yum yum.");
    }

    Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
