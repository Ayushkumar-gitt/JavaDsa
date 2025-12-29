public class OOPs {
    
    public static void main(String args[]){
        InnerOOPs.runfun();
        // InnerOOPs in = new InnerOOPs();
    }
}
class InnerOOPs {
    static InnerOOPs in = new InnerOOPs();
    public static void runfun(){
        System.out.println("auis");
    }    
    InnerOOPs(){
        System.out.println("Const");
    }

    public static InnerOOPs fun(){
        return in;
    }
}
