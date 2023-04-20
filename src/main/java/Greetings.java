public class Greetings {
    public static void main(String[] args) {
        String username = "admin";
        if (args.length>0){
            username = args[0];
        }
        System.out.println("Hi "+username+". \n\t\"welcome to java world\"");
    }
}
