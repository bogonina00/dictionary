package user;

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
    * @param userId id пользователя
    */
    public void setUserId(Long userId) { this.id = userId; }

    /**
    * Получить id пользователя
    * @return id пользователя
    */
    public Long getUserId(){ return id; }

    /**
     * Установить login пользователя
     * @param userLogin login пользователя
     */
    public void setUserLogin(String userLogin){ this.login = userLogin; }

    /**
     * Получить login пользователя
     * @return login пользователя
     */
    public String getUserLogin(){ return login; }

    /**
     * Установить surname пользователя
     * @param userSurname Surname пользователя
     */
    public void setUserSurname(String userSurname){
        this.surname = userSurname;
    }

    /**
     * Получить surname пользователя
     * @return surname пользователя
     */
    public String getUserSurname(){ return surname; }

    /**
     * Установить firstName пользователя
     * @param userFirstName firstName пользователя
     */
    public void setUserFirstName(String userFirstName){
        this.firstName = userFirstName;
    }

    /**
     * Получить firstName пользователя
     * @return firstName пользователя
     */
    public String getUserFirstName(){ return firstName; }

    /**
     * Установить userPassword пользователя
     * @param userPassword password пользователя
     */
    public void setUserPassword(String userPassword){
        this.password = userPassword;
    }

    /**
     * Получить password пользователя
     * @return password пользователя
     */
    public String getUserPassword(){ return password; }


}