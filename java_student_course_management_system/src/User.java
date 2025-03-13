import java.util.regex.Pattern;

public abstract class User {
    private String fullName;
    private String email;
    private String password;

    public User(String fullName, String email, String password) {
        this.setFullName(fullName);
        this.setEmail(email);
        this.setPassword(password);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (Validator.validateInput(fullName)) {
            this.fullName = fullName;
        } else {
            throw new IllegalArgumentException("Invalid full name");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (Validator.validateEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (Validator.validateInput(password)) {
            this.password = Cryptography.encrypt(password);
        } else {
            throw new IllegalArgumentException("Invalid password");
        }
    }

    public boolean verifyPassword(String password) {
        return Validator.validateInput(password) && Cryptography.verify(password, this.password);
    }

    public void updatePassword(String password, String newPassword) {
        if (this.verifyPassword(password)) {
            this.setPassword(newPassword);
        } else {
            throw new IllegalArgumentException("Incorrect password");
        }
    }
}
