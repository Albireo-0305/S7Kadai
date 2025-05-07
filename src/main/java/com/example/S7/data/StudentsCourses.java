package com.example.S7.data;

import javax.xml.crypto.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentsCourses {

  public int courseid;
  public int studentid;
  public String coursename;
  public Data startdate;
  public Data expectedenddate;

}
