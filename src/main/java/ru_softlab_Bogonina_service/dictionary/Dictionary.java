package ru_softlab_Bogonina_service.dictionary;

import ru_softlab_Bogonina_service.user.User;

import java.util.List;

/**
* Словарь
*/
public class Dictionary {

    private Long id;
    private User user;
    private LanguageType languageType;
    private List<Word> words;

    /**
     * Установить слова
     * @param words слова
     */
    public void setWords(List<Word> words) {
        this.words = words;
    }

    /**
     * Получить слова
     * @return words словаря
     */
    public List<Word> getWords() {
        return words;
    }

    /**
    * Установить id словаря
    * @param id id словаря
    */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    * Получить id словаря
    * @return id словаря
    */
    public Long getId() {
        return id;
    }

    /**
    * Установить пользователя словарём
    * @param user пользователь словаря
    */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Получить пользователя словарём
     * @return пользователь словарём
     */
    public User getUser() {
        return user;
    }

    /**
     * Установить язык словаря
     * @param languageType язык словаря
     */
    public void setLanguageType(LanguageType languageType) {
        this.languageType = languageType;
    }

    /**
    * Получить язык словаря
    * @return язык словаря
    */
    public LanguageType getLanguageType() {
        return languageType;
    }


}
