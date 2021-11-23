package com.example.ssm.controller;

import com.example.ssm.pojo.Books;
import com.example.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author shishuaiyang
 * @date 2021/11/23-上午11:19
 */
@Controller
@RequestMapping("/book")
public class BookController {


    @Autowired
    private BookService bookService;

    @RequestMapping("/allBook")
    public String allBook(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("books",books);
        return "allBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/updatePage/{id}")
    public String updatePage(Model model, @PathVariable("id") Integer id){
        Books books = bookService.queryBookById(id);
        model.addAttribute("books",books);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") Integer id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }
}
