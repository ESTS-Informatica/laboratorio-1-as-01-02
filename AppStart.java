public class AppStart
{
    private WordGuessingGame game;
    public static void main(String[] args) {
        game = new WordGuessingGame();

        game.play();
    }

}