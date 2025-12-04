// Leetcode - 1108
public class Defanging_IP {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        Defanging_IP_Strings(address);
    }
    public static String Defanging_IP_Strings(String address){
        String address1 = address.replace(".", "[.]");
        return address1;
    }
}