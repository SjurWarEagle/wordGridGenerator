package de.tkunkel.wordgrid;

import de.tkunkel.wordgrid.generator.WordGridGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(basePackages = "de.tkunkel")
public class Starter {

    private final WordGridGenerator wordGridGenerator;

    public Starter(WordGridGenerator wordGridGenerator) {
        this.wordGridGenerator = wordGridGenerator;
    }

    public static void main(String[] args) {
        SpringApplication.run(Starter.class, args);
    }

    @PostConstruct
    private void start() {
        wordGridGenerator.createNew(10, 10);
    }
}
