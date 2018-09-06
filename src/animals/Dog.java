package animals;

import org.springframework.stereotype.Component;

@Component
class Dog implements Animal {

    private Food food;

    public Dog(Food food) {
        this.food = food;
    }

    public Dog() {
        this.food = new DogFood();
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

    public void setFood(Food food) {
        this.food = food;
    }
}
