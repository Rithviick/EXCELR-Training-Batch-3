public class Demo005 {
    public static void main(String[] args) {
        String username = "TestUser01";
        String pwd = "TestPassword01";
        while((username == "TestUser01") && (pwd == "TestPassword01")) {
            System.out.println("Hello User");
            break;
        }
    }
}