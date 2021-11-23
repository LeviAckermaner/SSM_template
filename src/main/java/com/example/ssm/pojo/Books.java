package com.example.ssm.pojo;

/**
 * @author shishuaiyang
 * @date 2021/11/23-上午9:20
 */
public class Books {
    private Integer bookID;
    private String bookName;
    private Integer bookCounts;
    private String detail;

    public Books() {
    }

    public Books(String bookName, Integer bookCounts, String detail) {
        this.bookName = bookName;
        this.bookCounts = bookCounts;
        this.detail = detail;
    }

    public Integer getBookID() {
        return bookID;
    }

    public void setBookID(Integer bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookCounts() {
        return bookCounts;
    }

    public void setBookCounts(Integer bookCounts) {
        this.bookCounts = bookCounts;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
