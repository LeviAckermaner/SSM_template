package com.example.ssm.service;

import com.example.ssm.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author shishuaiyang
 * @date 2021/11/23-上午9:58
 */
public interface BookService {
    void addBook(Books books);

    void updateBook(Books books);

    void deleteBookById(@Param("bookId") Integer id);

    Books queryBookById(@Param("bookId") Integer id);

    List<Books> queryAllBook();
}
