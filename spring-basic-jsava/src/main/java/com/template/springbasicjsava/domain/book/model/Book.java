package com.template.springbasicjsava.domain.book.model;

import com.template.springbasicjsava.api.book.dto.response.BookResponse;
import com.template.springbasicjsava.domain.book.entity.BookJpaEntity;

public record Book(
        Long id,
        String title,
        String author
) {

    public Book {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank");
        }
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author cannot be blank");
        }
    }

    public BookJpaEntity toEntity() {
        return new BookJpaEntity(title, author);
    }

    public BookResponse toResponse() {
        return new BookResponse(id, title, author);
    }
}
