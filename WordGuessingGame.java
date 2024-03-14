import java.util.Scanner;

public class WordGuessingGame
{
    InputReader reader;

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

    public void play()
    {
        showWelcome();
        showGuessedWord();
        guess();
        showResult();
    }

    private void showWelcome()
    {
        System.out.println("-----------------------------\n\n");
        System.out.println("Welcome to word guessing game\n\n");
        System.out.println("-----------------------------\n\n");
    }

    private void guess()
    {

    }

    private void showResult()
    {
        System.out.println("Número de tentativas: " + numberOfTries);
    }

    private void showGuessedWord()
    {
        System.out.println(guessedWord);
    }
}