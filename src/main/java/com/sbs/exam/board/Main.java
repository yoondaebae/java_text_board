package com.sbs.exam.board;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    System.out.println("== 자바 텍스트 게시판 0.1v ==");
    System.out.println("== 자바 텍스트 게시판 시작 ==");
    Scanner sc = new Scanner(System.in);

    System.out.printf("명령 > ");
    String cmd = sc.nextLine();

    System.out.printf("입력 받은 명령어 : %s\n", cmd);

    System.out.println("== 자바 텍스트 게시판 종료 ==");

    sc.close();
  }
}