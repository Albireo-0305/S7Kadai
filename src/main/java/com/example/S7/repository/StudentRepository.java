package com.example.S7.repository;

import com.example.S7.data.Student;
import com.example.S7.data.StudentsCourses;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 受講生情報を扱うリポジトリ。
 * <p>
 * 全権検索や単一での検索、コースの情報も検索できるクラスです。
 */
@Mapper
public interface StudentRepository {

  /**
   * 全権検索します。
   *
   * @return全権検索した受講生情報の一覧
   */

  @Select("SELECT * FROM students")
  List<Student> Allstudents();

  @Select("SELECT * FROM Students_Courses")
  List<StudentsCourses> AllStudentsCourses();


}
