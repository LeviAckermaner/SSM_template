package com.example.ssm.service;

import com.example.ssm.dao.BooksMapper;
import com.example.ssm.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shishuaiyang
 * @date 2021/11/23-上午9:58
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BooksMapper booksMapper;

    public void addBook(Books books) {
        booksMapper.addBook(books);
    }

    public void updateBook(Books books) {
        booksMapper.updateBook(books);
    }

    public void deleteBookById(Integer id) {
        booksMapper.deleteBookById(id);
    }

    public Books queryBookById(Integer id) {
        return booksMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return booksMapper.queryAllBook();
    }
}
