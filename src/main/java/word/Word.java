package word;

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
    * @param wordId id слова
    */
    public void setWordId(Long wordId){ this.id=wordId; }

    /**
    * Получить id слова
    * @return id слова
    */
    public Long getWordId(){ return id; }

    /**
    * Установить перевод слова
    * @param wordTranslation перевод слова
    */
    public void setWordTranslation(String wordTranslation){
        this.translation = wordTranslation;
    }

    /**
    * Получить перевод слова
    * @return перевод слова
     */
    public String getWordTranslation(){ return translation; }

    /**
    * Установить транскрипцию слова
    * @param wordTranscription транскрипция слова
     */
    public void setWordTranscription(String wordTranscription){
        this.transcription = wordTranscription;
    }

    /**
     * Получить транскрипцию слова
     * @return транскрипция слова
     */
    public String getWordTranscriptions(){ return transcription; }

}
