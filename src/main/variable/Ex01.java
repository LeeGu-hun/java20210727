package variable;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("1"+"2");
        System.out.println(true+"");
        System.out.println('A'+'B');
        System.out.println('1'+2);
        System.out.println('1'+'2');
        System.out.println(true + "" + null);
        int x = 1;  //2
        int y = 2;  //3
        int z = 3;  //1
        int tmp = x;
        x = y;
        y = z;
        z = tmp;
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}
