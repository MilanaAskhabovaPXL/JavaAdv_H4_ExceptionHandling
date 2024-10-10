package be.pxl.ja.exercise;

import java.util.Arrays;
import java.util.List;

public class Pet {
    private int energy;
    private static final List<String> HARMFUL_FOOD = Arrays.asList("chocolate", "cucumber", "olive");

    public Pet(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    @Override
    public String toString() {
        return "Pet has energy level: " + energy;
    }

    public void feed(String food) {
        if (HARMFUL_FOOD.contains(food.toLowerCase())) {
            throw new WrongFoodException("You can't give your pet " + food);
        }
        energy += 20;

    }


    public void play() throws PetTiredException { // THROWS verplicht omwille van checked exception
        if (energy < 20) {
            throw new PetTiredException("Pet is too tired");
        }
        energy -= 30;
    }
}
