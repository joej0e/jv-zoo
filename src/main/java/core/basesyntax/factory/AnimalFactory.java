package core.basesyntax.factory;

import core.basesyntax.animals.Animal;
import core.basesyntax.animals.Penguin;
import core.basesyntax.animals.Shark;
import core.basesyntax.animals.Tiger;
import core.basesyntax.animals.Sparrow;
import core.basesyntax.enumerate.AnimalType;

public class AnimalFactory {
    public static <T extends Animal> T animalFactory(AnimalType animalType) {
        Animal animal;
        switch (animalType) {
            case SHARK:
                animal = new Shark();
                break;
            case TIGER:
                animal = new Tiger();
                break;
            case PENGUIN:
                animal = new Penguin();
                break;
            case SPARROW:
                animal = new Sparrow();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return (T) animal;
    }
}
