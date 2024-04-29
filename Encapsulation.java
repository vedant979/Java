class enDemo{
    private String name;
    private int pNo;

    public void setName(String name){
        this.name = name;
    }
    public void setpNo(int pNo){
        this.pNo = pNo;
    }
    public String getName(){
        return name;
    }
    public int getpNo(){
        return pNo;
    }
}
public class Encapsulation {

    public static void main(String[] args) {
        enDemo demoObj  = new enDemo();
        demoObj.setName("demoname");
        demoObj.setpNo(1234567890);

        System.out.println(demoObj.getName());
        System.out.println(demoObj.getpNo());
    }
}
