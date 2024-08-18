package ssg.library.script;

public class Script {
  // 출력 메세지 및 스크립트를 포함하고 있는 클래스 입니다.
  // 모두 완성하면 각 파트를 메서드로 재구성해서 Main 클래스에서 사용하도록 합니다.

  StringBuilder sb =new StringBuilder();
  int index = 1;

  public void printString(StringBuilder stringBuilder) {
    String str = stringBuilder.toString();
    System.out.print(str);
    stringBuilder.delete(0, stringBuilder.length());
  }


  public void printInputNumber() {
    sb.append("번호를 입력해 주세요 :  ");
    printString(sb);
  }

  public void printFaultInput() {
    sb.append("잘못 입력하셨습니다.\n");
    printString(sb);
  }



  /** 재고 관리 메뉴(관리자) */
  public void printAdminStockMenu() {
    index =1;
    sb.append("---재고 관리 메뉴---\n").append("\t")
        .append(index++).append(". 재고조회\t").append(index++).append(". 이전화면\n");
    printString(sb);
    printInputNumber();
  }

  /** 재고 관리 메뉴(회원) */
  public void printMemberStockMenu() {
    index =1;
    sb.append("---재고 관리 메뉴---\n").append("\t")
        .append(index++).append(". 재고조회\t").append(index++).append(". 이전화면\n");
    printString(sb);
    printInputNumber();
  }

  /** 입고 관리 메뉴(관리자) */
  public void printAdminInboundMenu() {
    index =1;
    sb.append("---입고 관리 메뉴---\n").append("\t")
        .append(index++).append(". 입고요청승인\t").append(index++).append(". 입고요청 수정\t").append(index++).append(". 입고요청 취소\t").
        append(index++).append(". 입고지시서 조회\n").append("\t").append(index++).append(". 입고리스트 조회\n").append(index++).append(". 입고현황 조회\t").
        append(index++).append(". 이전화면\n");
    printString(sb);
    printInputNumber();
  }

  /** 입고 관리 메뉴(회원) */
  public void printMemberInboundMenu() {
    index =1;
    sb.append("---입고 관리 메뉴---\n").append("\t")
        .append(index++).append(". 입고요청\t").append(index++).append(". 입고요청 수정\t").append(index++).append(". 입고요청 취소\t").
        append(index++).append(". 입고요청 조회\n").append("\t").append(index++).append(". 입고현황 조회\t").append(". 이전화면\n");
    printString(sb);
    printInputNumber();
  }



  /** 임시 */
  public void temp() {

    System.out.println("<로그인 성공 시>");
    System.out.println("000 관리자님 반갑습니다!");
    System.out.println();
    System.out.println("============================================================================");

  }










}