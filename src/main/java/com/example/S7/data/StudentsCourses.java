package com.example.S7.data;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentsCourses {

  public int courseid;
  public int studentid;
  public String coursename;
  public Date startdate;
  public Date expectedenddate;

}