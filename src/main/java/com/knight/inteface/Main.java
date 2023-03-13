package com.knight.inteface;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

//  public static void main(String[] args) throws Exception {
//    BufferedReader br = new BufferedReader(
//        new FileReader("src/main/java/com/knight/inteface/setting.txt"));
//    String className = br.readLine();
//    Class clazz = Class.forName(className);
//    Inter cClazz = (Inter) clazz.newInstance();
//
//    A a = new A();
//    a.print(cClazz);
//
//
//  }

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(
        new FileReader("src/main/java/com/knight/inteface/setting.txt"));

    String className = br.readLine();

    Class bClazz = Class.forName(className);

    Inter b = (Inter) bClazz.newInstance();
    A a = new A();
    a.print(b);


  }


}
