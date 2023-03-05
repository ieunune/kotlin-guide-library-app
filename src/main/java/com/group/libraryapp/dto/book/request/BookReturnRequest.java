package com.group.libraryapp.dto.book.request;

public class BookReturnRequest {

  /// Fields
  private String userName;
  private String bookName;

  /// Constructor
  public BookReturnRequest(String userName, String bookName) {
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
