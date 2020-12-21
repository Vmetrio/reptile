package com.meng.reptile.repository;

import com.meng.reptile.entity.Books;
import com.meng.reptile.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends BaseRepository<Books, Integer> {
}
