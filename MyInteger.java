import java.util.*;

class MyInteger{

    public static int compare(int x, int y) {
        return Integer.compare(x, y);
    }

    public static int compareUnsigned(int x, int y){
        return Integer.compareUnsigned(x,y);
    };

    public static int divideUnsigned(int x, int y){
        return Integer.divideUnsigned(x, y);
    };
    public static void main(String[] args) {
    MyInteger m=new MyInteger();
   System.out.println( m.compare(7,6));
   System.out.println( m.compareUnsigned(4, 3));
   System.out.println(m.divideUnsigned(8, 2));
    }
}
