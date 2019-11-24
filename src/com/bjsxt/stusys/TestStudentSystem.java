package com.bjsxt.stusys;

import java.util.Scanner;

/*

 */
public class TestStudentSystem {
    public static void main(String[] args) {
     StudentSystem system=new StudentSystem();
     system.welcome();
        Scanner scanner=new Scanner(System.in);
      while(true){
          system.showMenu();
          int input=MyUtil.getInputNumber("请输入你的操作:",scanner);
          switch (input){
              case 1:
                  system.showAll();
                  break;
              case 2:
                  system.addStudent();
                  break;
              case 3:
                  system.findStuBySid();
                  break;
              case 4:
                  system.findStuByName();
                  break;
              case 5:
                  system.removeStuBySid();
                  break;
              case 6:
                  system.modifyStuBySid();
                  break;
              case 7:
                  system.exit ();
                  return;



          }
      }
    }
}
