package com.template.springbasicjsava.api.book.dto.response;

public record BookResponse(
        Long id,
        String title,
        String author
) {
}
