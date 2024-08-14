package main.java.com.ssg.service.login;

import main.java.com.ssg.dao.login.loginDao;

public class loginService implements loginServiceInterface{

  loginDao loginDao = new loginDao();

  @Override
  public void login() {
    System.out.println("로그인 어쩌구");
  }

  @Override
  public void findID() {
    System.out.println("아이디를 찾아라");
  }

  @Override
  public void findPassWord() {
    System.out.println("비밀번호를 찾아라");
  }

  @Override
  public void logout() {
    System.out.println("로그아웃");
  }

  @Override
  public void createMember() {
    System.out.println("회원 등록");
  }
}
