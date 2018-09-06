package animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Cat implements Animal {

    private Food food;

    public Cat(Food food) {
        this.food = food;
    }

    public Cat() {
        this.food = new CatFood();
    }

    @Override
    public void makeASound() {

    }

    @Override
    public void eat() {

    }

    public Food getFood() {
        return food;
    }

    @Autowired
    public void setFood(CatFood food) {
        this.food = food;
    }


}
