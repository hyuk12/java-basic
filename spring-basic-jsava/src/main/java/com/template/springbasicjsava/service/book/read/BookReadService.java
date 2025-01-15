package com.template.springbasicjsava.service.book.read;

import com.template.springbasicjsava.domain.book.entity.BookJpaEntity;
import com.template.springbasicjsava.domain.book.entity.repository.BookJpaRepository;
import com.template.springbasicjsava.domain.book.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookReadService {
    private final BookJpaRepository bookReadRepository;

    public Book getBookById(Long id) {
        return bookReadRepository.findById(id)
                .map(BookJpaEntity::fromEntity)
                .orElseThrow(() -> new IllegalArgumentException("Book not found"));
    }
}
