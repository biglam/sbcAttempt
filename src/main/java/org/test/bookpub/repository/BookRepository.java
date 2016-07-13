package org.test.bookpub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.bookpub.entity.Book;

/**
 * Created by lam on 11/07/16.
 */
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    Book findBookByIsbn(String isbn);
}
