package animals;

import org.springframework.stereotype.Component;

@Component
class CatFood implements Food {

    private final String name;

    CatFood(final String name) {
        this.name = name;
    }

    CatFood() {
        this.name = "Plain Cat Food";
    }

    @Override
    public Food getSomethingToEat() {
        return new DogFood();
    }

    @Override
    public String toString() {
        return "Cat food: " + this.name;
    }
}