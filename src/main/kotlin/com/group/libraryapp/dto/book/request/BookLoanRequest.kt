package com.group.libraryapp.dto.book.request;

public class BookLoanRequest {

  /// Fields
  private String userName;
  private String bookName;

  /// Cunstructor
  public BookLoanRequest(String userName, String bookName) {
    this.userName = userName;
    this.bookName = bookName;
  }

  /// Method
  public String getUserName() {
    return userName;
  }

  public String getBookName() {
    return bookName;
  }

}
