package de.tkunkel.wordgrid;

import de.tkunkel.wordgrid.generator.WordGridGenerator;
import de.tkunkel.wordgrid.types.WordGrid;

public class Starter {
    public static void main(String[] args) {
        WordGrid wordGrid = new WordGridGenerator().createNew(10, 10);

    }
}
