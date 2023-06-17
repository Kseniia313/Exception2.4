public class Main {
    public static void main(String[] args) {
        try {
            Validator.validateWithRegex("login", "password", "passwordconfirm");
        } catch (WrongLoginException | WrongPasswordException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
