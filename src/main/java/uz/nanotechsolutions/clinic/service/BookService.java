package uz.nanotechsolutions.clinic.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.nanotechsolutions.clinic.entity.Book;
import uz.nanotechsolutions.clinic.payload.request.BookRequest;
import uz.nanotechsolutions.clinic.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    @Transactional
    public void save(BookRequest request) {

        Optional<Book> byId = bookRepository.findById(request.getId());
        Book book;
        book = byId.orElseGet(Book::new);
        book.setAuthor(request.getAuthor());
        book.setIsbn(request.getIsbn());
        bookRepository.save(book);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
