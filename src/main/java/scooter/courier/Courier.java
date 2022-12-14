package scooter.courier;

import org.apache.commons.lang3.RandomStringUtils;

public class Courier {

    private String login;
    private String password;
    private String firstName;

    public Courier() {
    }
    public Courier(String login, String password, String firstName) {
        this.login = login;
        this.password = password;
       this.firstName = firstName;
    }

    public static Courier getRandomCourier() {
        final String courierLogin = RandomStringUtils.randomAlphabetic(10);
        final String courierPassword = RandomStringUtils.randomAlphabetic(10);
        final String courierFirstName = RandomStringUtils.randomAlphabetic(10);
        return new Courier(courierLogin, courierPassword, courierFirstName);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
