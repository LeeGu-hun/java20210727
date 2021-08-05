package loop_condition;

import javax.swing.*;

public class Exercise07 {
  public static void main(String[] args) {
    String input = JOptionPane.showInputDialog(
            "합하고자 하는 숫자를 입력하시요");
    int sum = 0;
    for (int i = 0; i < input.length(); i++) {
      sum += input.charAt(i)-48;
    }
    System.out.println("total: " + sum);
  }
}
