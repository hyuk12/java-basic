package com.template.springbasicjsava.service.book.facade;

import com.template.springbasicjsava.api.book.dto.request.BookRequest;
import com.template.springbasicjsava.api.book.dto.response.BookResponse;
import com.template.springbasicjsava.domain.book.entity.BookJpaEntity;
import com.template.springbasicjsava.service.book.read.BookReadService;
import com.template.springbasicjsava.service.book.write.BookWriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookFacadeService {
    private final BookWriteService bookWriteService;
    private final BookReadService bookReadService;

    public BookResponse saveBook(BookRequest request) {
        BookJpaEntity entity = request.toModel().toEntity();
        return BookJpaEntity.fromEntity(bookWriteService.saveBook(entity)).toResponse();
    }

    public BookResponse getBookById(Long id) {
        return bookReadService.getBookById(id).toResponse();
    }
}
