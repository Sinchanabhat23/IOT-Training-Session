package DSA.collection.lamdaExpression;
interface Calculator{
    int operate(int a,int b);
}
public class LamdaReturnStatement {
    public static void main(String[] args) {
        Calculator multiply=(a,b)->{
            int result=a*b;
            return result;
        };
        System.out.println("Multiplicatoion:"+multiply.operate(9,9));
    }
}
