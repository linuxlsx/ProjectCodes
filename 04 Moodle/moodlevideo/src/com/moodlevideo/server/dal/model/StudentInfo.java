package com.moodlevideo.server.dal.model;

public class StudentInfo
{
  private String id;
  private String password;
  private String name;
  private String description;
  
  public String getId()
  {
    return this.id;
  }
  
  public void setId(String id)
  {
    this.id = (id == null ? null : id.trim());
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public void setPassword(String password)
  {
    this.password = (password == null ? null : password.trim());
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = (name == null ? null : name.trim());
  }
  
  public String getDescription()
  {
    return this.description;
  }
  
  public void setDescription(String description)
  {
    this.description = (description == null ? null : description.trim());
  }
}
