package com.group.libraryapp.dto.book.request;

public class BookRequest {

  /// Fields
  private String name;

  /// Constuctor
  public BookRequest(String name) {
    this.name = name;
  }

  /// Method
  public String getName() {
    return name;
  }

}
