package animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
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
