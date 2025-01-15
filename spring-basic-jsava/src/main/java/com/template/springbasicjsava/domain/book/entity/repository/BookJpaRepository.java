package com.template.springbasicjsava.domain.book.entity.repository;

import com.template.springbasicjsava.domain.book.entity.BookJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookJpaRepository extends JpaRepository<BookJpaEntity, Long> {
}
