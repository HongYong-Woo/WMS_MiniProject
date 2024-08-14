package main.java.com.ssg.dto;

import java.sql.Timestamp;

import main.java.com.ssg.enums.UserType;

public class Member {

  private int id;
  private String userId;
  private String password;
  private String userName;
  private String bRN;
  private UserType userType = UserType.GUEST;
  private String memberConfirm; //추후에 enum으로 변경
  private Timestamp createdAt;
  private String userPhone;
  private String address;

}
