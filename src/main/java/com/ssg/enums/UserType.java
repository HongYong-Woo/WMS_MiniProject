package main.java.com.ssg.enums;

public enum UserType {
  ADMINISTRATOR(1, "관리자"),    //관리자
  WH_ADMIN(2, "창고관리자"),         //창고관리자
  NORMAL_MEMBER(3, "직원"),    //직원
  PRESIDENT_MEMBER(4, "사장"), //사장
  DELIVERY_DRIVER(5, "배송기사"),   //배송기사
  GUEST(6, "비회원");             //비회원

    int value1;

}
