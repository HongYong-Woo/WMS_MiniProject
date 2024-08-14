package main.java.com.ssg.controller.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import main.java.com.ssg.library.Script;
import main.java.com.ssg.service.login.loginService;

public class loginController {

  Script  script = new Script();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  loginService loginService = new loginService();
  /** 처음 실행시 실행 */
  public void start() {
    boolean processCheck = true;
    while(processCheck) {
      try {
        script.printStartMenu();
        int select = Integer.parseInt(br.readLine());
        switch (select) {
          case 1 -> { loginMenu(); processCheck = false;}
          case 2 -> System.out.println("출고관리");
          case 3 -> System.out.println("고객센터");
          case 4 -> {processCheck = false;
            System.out.println("프로그램 종료");}
          default -> throw new NumberFormatException();
        }
      } catch (NumberFormatException | IOException e) {
        System.out.println("잘못된 입력입니다.");
      }
    }
  }

  public void loginMenu() {
    boolean processCheck = true;
    while(processCheck) {
      try {
        script.printLoginAllMenu();
        int select = Integer.parseInt(br.readLine());
        switch (select) {
          case 1 -> loginService.login();
          case 2 -> loginService.findID();
          case 3 -> loginService.findPassWord();
          case 4 -> loginService.createMember();
          case 5 -> {start(); processCheck = false;}
          default -> throw new NumberFormatException();
        }
      } catch (NumberFormatException | IOException e) {
        System.out.println("잘못된 입력입니다.");
      }
    }
  }

}
