package uz.nanotechsolutions.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.nanotechsolutions.clinic.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
