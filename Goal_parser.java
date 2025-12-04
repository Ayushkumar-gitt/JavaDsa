// Leetcode - 1678
public class Goal_parser {
    public static void main(String[] args) {
        String command = "G()(al)";
        interpret(command);
    }

    public static void interpret(String command) {
        String val1 = command.replace("G", "G").replace("()", "o").replace("(al)", "al");

        System.out.println(val1);
    }
}
