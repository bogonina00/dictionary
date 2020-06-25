<<<<<<< HEAD:src/main/java/ru/softlab/bogonina/dictionary/Word.java
package ru.softlab.bogonina.dictionary;
=======
package dictionary;
>>>>>>> 4470b87d4967b01eb22f0bab1af4dc82b958da60:src/main/java/dictionary/Word.java

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
<<<<<<< HEAD:src/main/java/ru/softlab/bogonina/dictionary/Word.java
    public void setId(Long id) {
        this.id = id;
=======
    public void setId(Long id){
        this.id=id;
>>>>>>> 4470b87d4967b01eb22f0bab1af4dc82b958da60:src/main/java/dictionary/Word.java
    }

    /**
    * Получить id слова
    * @return id слова
    */
<<<<<<< HEAD:src/main/java/ru/softlab/bogonina/dictionary/Word.java
    public Long getId() {
=======
    public Long getId(){
>>>>>>> 4470b87d4967b01eb22f0bab1af4dc82b958da60:src/main/java/dictionary/Word.java
        return id;
    }

    /**
    * Установить перевод слова
    * @param translation перевод слова
    */
<<<<<<< HEAD:src/main/java/ru/softlab/bogonina/dictionary/Word.java
    public void setTranslation(String translation) {
=======
    public void setTranslation(String translation){
>>>>>>> 4470b87d4967b01eb22f0bab1af4dc82b958da60:src/main/java/dictionary/Word.java
        this.translation = translation;
    }

    /**
    * Получить перевод слова
    * @return перевод слова
     */
<<<<<<< HEAD:src/main/java/ru/softlab/bogonina/dictionary/Word.java
    public String getTranslation() {
=======
    public String getTranslation(){
>>>>>>> 4470b87d4967b01eb22f0bab1af4dc82b958da60:src/main/java/dictionary/Word.java
        return translation;
    }

    /**
    * Установить транскрипцию слова
    * @param transcription транскрипция слова
     */
<<<<<<< HEAD:src/main/java/ru/softlab/bogonina/dictionary/Word.java
    public void setTranscription(String transcription) {
=======
    public void setTranscription(String transcription){
>>>>>>> 4470b87d4967b01eb22f0bab1af4dc82b958da60:src/main/java/dictionary/Word.java
        this.transcription = transcription;
    }

    /**
     * Получить транскрипцию слова
     * @return транскрипция слова
     */
<<<<<<< HEAD:src/main/java/ru/softlab/bogonina/dictionary/Word.java
    public String getTranscription() {
=======
    public String getTranscriptions(){
>>>>>>> 4470b87d4967b01eb22f0bab1af4dc82b958da60:src/main/java/dictionary/Word.java
        return transcription;
    }

}
