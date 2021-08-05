package object2;

public class MemberEx {
  public static void main(String[] args) {
    Member m = new Member();
//    m.age = -10;
    m.setAge(-10);
    System.out.println(m.getAge());
  }
}

class Member {
  private int no;
  private String name, id, pw, mobile;
  private int age;
  public void setAge(int age) {
    if(age>0) this.age = age;
    else System.out.println("나이에 걸맞지 않습니다.");
  }
  public int getAge(){
    return age;
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPw() {
    return pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
}