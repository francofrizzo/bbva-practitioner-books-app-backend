package bbvaPractitioner.bookappbackend;

import bbvaPractitioner.bookappbackend.entities.Book;
import bbvaPractitioner.bookappbackend.repositories.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PreloadDatabase {
    private static Logger logger = LoggerFactory.getLogger(PreloadDatabase.class);

    @Bean
    public CommandLineRunner preloadBooks(BookRepository bookRepository) {
        return args -> {
            this.logger.info("Executing preloadBooks");
            Book savedBook1 = bookRepository.save(new Book(
                    "Rayuela",
                    "...",
                    1963,
                    "Argentina"
            ));
            this.logger.info(String.format("Preloading: %s", savedBook1));
            Book savedBook2 = bookRepository.save(new Book(
                    "El Aleph",
                    "...",
                    1949,
                    "Argentina"
            ));
            this.logger.info(String.format("Preloading: %s", savedBook2));
        };
    }
}
