package bbvaPractitioner.bookappbackend.repositories;

import bbvaPractitioner.bookappbackend.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
