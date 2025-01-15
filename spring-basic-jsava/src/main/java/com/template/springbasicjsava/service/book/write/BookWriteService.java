package com.template.springbasicjsava.service.book.write;

import com.template.springbasicjsava.domain.book.entity.BookJpaEntity;
import com.template.springbasicjsava.domain.book.entity.repository.BookJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookWriteService {
    private final BookJpaRepository bookJpaRepository;

    public BookJpaEntity saveBook(BookJpaEntity bookJpaEntity) {
        return bookJpaRepository.save(bookJpaEntity);
    }
}
