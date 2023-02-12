package de.tkunkel.wordgrid.generator;

import de.tkunkel.wordgrid.types.WordGrid;

public class WordGridGenerator {

    public WordGridGenerator() {
    }

    public WordGrid createNew(int width, int height) {
        return new WordGrid(width,height);
    }
}
