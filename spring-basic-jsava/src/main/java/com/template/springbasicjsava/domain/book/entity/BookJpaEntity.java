package com.template.springbasicjsava.domain.book.entity;

import com.template.springbasicjsava.domain.book.model.Book;
import com.template.springbasicjsava.global.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class BookJpaEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;

    public BookJpaEntity(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static Book fromEntity(BookJpaEntity entity) {
        return new Book(entity.id, entity.getTitle(), entity.getAuthor());
    }

}

