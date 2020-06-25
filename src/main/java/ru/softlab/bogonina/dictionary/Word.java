package ru.softlab.bogonina.dictionary;


/**
* Слово
*/
public class Word {
    private Long id;
    /*private String native;*/
    private String translation;
    private String transcription;

    /**
    * Установить id слова
    * @param id id слова
    */
    public void setId(Long id){
        this.id=id;
    }

    /**
    * Получить id слова
    * @return id слова
    */
    public Long getId(){
        return id;
    }

    /**
    * Установить перевод слова
    * @param translation перевод слова
    */
    public void setTranslation(String translation){
        this.translation = translation;
    }

    /**
    * Получить перевод слова
    * @return перевод слова
     */
    public String getTranslation(){
        return translation;
    }

    /**
    * Установить транскрипцию слова
    * @param transcription транскрипция слова
     */
    public void setTranscription(String transcription){
        this.transcription = transcription;
    }

    /**
     * Получить транскрипцию слова
     * @return транскрипция слова
     */
    public String getTranscriptions(){
        return transcription;
    }

}
