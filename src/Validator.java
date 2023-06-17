
import java.util.Objects;
import java.util.regex.Pattern;

public class Validator {
    private final static Pattern regex = Pattern.compile("[A-Za-z0-9_](0,20)");

    public static void validateWithRegex(String login, String password, String passwordConfirm) {
        if ((Objects.isNull(login)) || (Objects.isNull(password)))
            throw new RuntimeException("Логин или пароль не должен быть null");

        if (!login.matches(regex.pattern())) {
            throw new WrongLoginException("Имя не должно быть больше 20 символом и должно " +
                    "содержать только латинские буквы,цифры и нижнее подчеркивание ");
        }
        if (!password.matches(regex.pattern())) {
            throw new WrongPasswordException("Пароль не должен быть больше 20 символом и должен " +
                    "содержать только латинские буквы,цифры и нижнее подчеркивание ");

        }
        if (!Objects.equals(password, passwordConfirm)) {
            throw new WrongPasswordException("  Пароли не совпадают ");
        }

    }
}
