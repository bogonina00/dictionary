package dictionary;

import languageType.LanguageType;
import user.User;

/**
* Словарь
*/
public class Dictionary {

    private Long id;
    private User user;
    private LanguageType languageType;

    /**
    * Установить id словаря
    * @param dictionaryId id словаря
    */
    public void setDictionaryId(Long dictionaryId) { this.id = dictionaryId; }

    /**
    * Получить id словаря
    * @return id словаря
    */
    public Long getDictionaryId(){ return id; }

    /**
    * Установить пользователя словарём
    * @param dictionaryUser пользователь словаря
    */
    public void setDictionaryUser(User dictionaryUser){ this.user = dictionaryUser; }

    /**
     * Получить пользователя словарём
     * @return пользователь словарём
     */
    public User getDictionaryUser(){ return user; }

    /**
     * Установить язык словаря
     * @param dictionaryLanguageType язык словаря
     */
    public void setDictionaryLanguageType(LanguageType dictionaryLanguageType){
        this.languageType = dictionaryLanguageType;
    }

    /**
    * Получить язык словаря
    * @return язык словаря
    */
    public LanguageType getLanguageType(){ return languageType; }

}
