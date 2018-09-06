package animals;

import org.springframework.stereotype.Component;

@Component
class FishFood implements Food {
    @Override
    public Food getSomethingToEat() {
        return new FishFood();
    }
}
