package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {

  /// Fields
  private String name;
  private Integer age;

  /// Constructor
  public UserCreateRequest(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  /// Method
  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

}
