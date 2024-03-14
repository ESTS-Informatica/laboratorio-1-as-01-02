import java.util.Scanner;

public class WordGuessingGame
{
    private InputReader reader;
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;

    //construtor da classe
    public WordGuessingGame(){
        this.hiddenWord = "";
        this.guessedWord = "";
        this.numberOfTries = 0;
    }

    /*Selectores e Modificadores das variáveis*/
    public String getHiddenWord() {
        return this.hiddenWord;
    }
    public String getGuessedWord() {
        return this.guessedWord;
    }

    public int getNumberOfTries(){
        return this.numberOfTries;
    }

    public void setHiddenWord(String newHiddenWord){
        this.hiddenWord = newHiddenWord;
    }

    public void setGuessedWord(String newGuessedWord){
        this.guessedWord = newGuessedWord;
    }

    public void setNumberOfTries(int newNumberOfTries){
        this.numberOfTries  = newNumberOfTries;
    }

    private void play()
    {

    }
}