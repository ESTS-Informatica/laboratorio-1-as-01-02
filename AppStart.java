public class AppStart
{
    private static WordGuessingGame game;
    
    public static void main(String[] args) {
        game = new WordGuessingGame();

        game.play();
    }

}