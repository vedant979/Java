class Demo{
    public Demo(int n){
        System.out.println("in Demo int");
    }
    public Demo(){
        this(10);

        System.out.println("in Demo");
    }


}
class Demo2 extends Demo{
    public Demo2(){
        System.out.println("in Demo2");
    }
    public Demo2(int n){
//        super(10);
        System.out.println("in Demo2 int");
    }
}
public class thisSuperKeyword {
    public static void main(String[] args) {
        Demo2 obj = new Demo2();
    }
}
