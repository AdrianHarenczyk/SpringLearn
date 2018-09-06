package animals;

import org.springframework.stereotype.Component;

@Component
class DogFood implements Food {

    private final String name;

    DogFood(final String name) {
        this.name = name;
    }

    DogFood() {
        this.name = "Plain Dog Food";
    }

    @Override
    public Food getSomethingToEat() {
        return new DogFood();
    }

    @Override
    public String toString() {
        return "Dog food: " + this.name;
    }
}
