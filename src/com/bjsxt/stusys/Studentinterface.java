package com.bjsxt.stusys;

import java.util.List;

public interface Studentinterface {
    //遍历所有学生
    void showAll();

    boolean addStudent();

    Student findStuBySid(int sid);

    List<Student> findStuByName(String name);

    boolean removeStuBySid(int sid);
    boolean modifyStuBySid(int id);
}
