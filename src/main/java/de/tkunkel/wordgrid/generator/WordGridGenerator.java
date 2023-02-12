package de.tkunkel.wordgrid.generator;

import de.tkunkel.wordgrid.types.WordGrid;
import org.springframework.stereotype.Service;

@Service
public class WordGridGenerator {
    private final WordGridFiller wordGridFiller;

    public WordGridGenerator(WordGridFiller wordGridFiller) {
        this.wordGridFiller = wordGridFiller;
    }

    public WordGrid fillEmpty(WordGrid wordGrid) {
        return wordGrid;
    }

    public WordGrid createNew(int width, int height) {
        WordGrid wordGrid = createEmpty(width, height);
        wordGrid = fillEmpty(wordGrid);
        return wordGrid;
    }

    public WordGrid createEmpty(int width, int height) {
        return new WordGrid(width, height);
    }
}
