import java.util.Scanner;

public class WordGuessingGame
{

    private InputReader reader;
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;

    //construtor da classe
    public WordGuessingGame(){
        this.hiddenWord = "abc";
        this.guessedWord = "---";
        this.numberOfTries = 0;
        reader = new InputReader();
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
        while (guessedWord.equals(hiddenWord) != true)
        {
            showGuessedWord();
            guess();
        }
        showResult();
    }

    private void showWelcome()
    {
        System.out.println("-----------------------------\n");
        System.out.println("Bem vindo ao jogo da forca\n");
        System.out.println("-----------------------------\n\n");
    }

    private void guess()
    {
        char guessedLetter = reader.getChar("Introduza uma letra: ");
        StringBuilder stringBuilder = new StringBuilder(guessedWord);

        for (int i = 0; i < hiddenWord.length(); i++)
        {
            if (guessedWord.charAt(i) != guessedLetter)
            {
                if (guessedLetter == hiddenWord.charAt(i))
                {
                    stringBuilder.setCharAt(i, guessedLetter);
                    guessedWord = stringBuilder.toString();

                    System.out.println("A letra " + guessedLetter + " está certa!" );
                    return;
                }
            }
            else
            {
                System.out.println("Essa letra já foi adivinhada!");
                return;
            }
        }

        System.out.println("A essa letra não está na palavra! ");
        numberOfTries++;
    }

    private void showResult()
    {
        System.out.println("A palavra foi adivinhada! A palavra era: " + hiddenWord);
        System.out.println("Número de tentativas erradas: " + numberOfTries);
    }

    private void showGuessedWord()
    {
        System.out.println(guessedWord);
    }
}