package com.group.libraryapp.dto.user.request;

public class UserUpdateRequest {

  /// Fields
  private long id;
  private String name;

  /// Constructor
  public UserUpdateRequest(long id, String name) {
    this.id = id;
    this.name = name;
  }

  /// Method
  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

}
