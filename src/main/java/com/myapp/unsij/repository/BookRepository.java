package com.myapp.unsij.repository;

import com.myapp.unsij.entity.Book;
import com.myapp.unsij.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    //SELECT * FROM BOOK WHERE ID = ?
    public Optional<Book> findById(Long id);

    @Query(value = "SELECT B.id, B.title, B.isbn, B.year FROM BOOK B INNER JOIN TAG T WHERE T.book_id = B.id AND T.name in ?", nativeQuery = true)
    public List<Book> findAllByTags(Set<String> tags);
}
