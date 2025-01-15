package com.template.springbasicjsava.api.book.dto.request;

import com.template.springbasicjsava.domain.book.model.Book;
import jakarta.validation.constraints.NotBlank;

public record BookRequest(
        @NotBlank(message = "Title is mandatory")
        String title,
        @NotBlank(message = "Author is mandatory")
        String author
) {

    public Book toModel() {
        return new Book(null, this.title(), this.author());
    }
}
