package ru_softlab_Bogonina_service.user;

/**
 * Пользователь
*/
public class User {

    private Long id;
    private String login;
    private String password;
    private String surname;
    private String firstName;

    /**
    * Установить id пользователя
    * @param id id пользователя
    */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * Получить id пользователя
    * @return id пользователя
    */
    public Long getId() {
        return id;
    }

    /**
     * Установить login пользователя
     * @param login login пользователя
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Получить login пользователя
     * @return login пользователя
     */
    public String getLogin() {
        return login;
    }

    /**
     * Установить surname пользователя
     * @param surname Surname пользователя
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Получить surname пользователя
     * @return surname пользователя
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Установить firstName пользователя
     * @param firstName firstName пользователя
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Получить firstName пользователя
     * @return firstName пользователя
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Установить userPassword пользователя
     * @param password password пользователя
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Получить password пользователя
     * @return password пользователя
     */
    public String getPassword() {
        return password;
    }


}