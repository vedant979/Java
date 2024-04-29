//A Demo representation of Inheritance
class calculator{


    public void sum(int n1, int n2){
        System.out.println(n1+n2);
    }
    public void diff(int n1, int n2){
        System.out.println(n1-n2);
    }

}
class AdvCalculator extends calculator {
    public void prod(int n1, int n2){
        System.out.println(n1*n2);
    }
    public void div(int n1, int n2){
        System.out.println(n1/n2);
    }
}
class veryAdvCalc extends AdvCalculator{
    public void power(int n1, int n2){
        System.out.println(Math.pow(n1,n2));
    }
}
public class inheritance {
    public static void main(String[] args) {
        calculator obj = new calculator();
        AdvCalculator obj1 = new AdvCalculator();
        veryAdvCalc obj2 = new veryAdvCalc();
    //Basic Calc Methods
        obj2.sum(1,2);
        obj2.diff(3,2);

    //Advance Calc Methods
        obj2.div(6,2);
        obj2.prod(6,2);
        obj2.sum(6,2);
        obj2.diff(6,2);

    //very Advance calc methods
        obj2.power(10,10);
    }
}
