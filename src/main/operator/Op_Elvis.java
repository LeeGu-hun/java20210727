package operator;

public class Op_Elvis {
    public static void main(String[] args) {
        int x = -5;
        int absX = x>=0?x:-x;
        System.out.println("절대값: "+absX);
        char signX = (x>0)?'+':(x==0)?' ':'-';
        System.out.printf("x = %c%d %n",signX,absX);
    }
}
