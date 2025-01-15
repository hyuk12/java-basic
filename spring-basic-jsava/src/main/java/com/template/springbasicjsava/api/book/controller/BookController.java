package com.template.springbasicjsava.api.book.controller;

import com.template.springbasicjsava.api.book.dto.request.BookRequest;
import com.template.springbasicjsava.api.book.dto.response.BookResponse;
import com.template.springbasicjsava.service.book.facade.BookFacadeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
@Tag(name = "Book", description = "Book API")
public class BookController {

    private final BookFacadeService bookFacadeService;

    @PostMapping
    @Operation(summary = "Save book")
    public ResponseEntity<BookResponse> saveBook(@Valid @RequestBody BookRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(bookFacadeService.saveBook(request));
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get book by id")
    public ResponseEntity<BookResponse> getBookById(@PathVariable Long id) {
        return ResponseEntity.ok(bookFacadeService.getBookById(id));
    }
}
