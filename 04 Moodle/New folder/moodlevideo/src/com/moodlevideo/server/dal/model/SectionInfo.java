package com.moodlevideo.server.dal.model;

public class SectionInfo
{
  private String sectionid;
  private Integer lessonid;
  private String starttime;
  private String endtime;
  private String description;
  private String url;
  
  public String getSectionid()
  {
    return this.sectionid;
  }
  
  public void setSectionid(String sectionid)
  {
    this.sectionid = (sectionid == null ? null : sectionid.trim());
  }
  
  public Integer getLessonid()
  {
    return this.lessonid;
  }
  
  public void setLessonid(Integer lessonid)
  {
    this.lessonid = lessonid;
  }
  
  public String getStarttime()
  {
    return this.starttime;
  }
  
  public void setStarttime(String starttime)
  {
    this.starttime = (starttime == null ? null : starttime.trim());
  }
  
  public String getEndtime()
  {
    return this.endtime;
  }
  
  public void setEndtime(String endtime)
  {
    this.endtime = (endtime == null ? null : endtime.trim());
  }
  
  public String getDescription()
  {
    return this.description;
  }
  
  public void setDescription(String description)
  {
    this.description = (description == null ? null : description.trim());
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public void setUrl(String url)
  {
    this.url = (url == null ? null : url.trim());
  }
}
