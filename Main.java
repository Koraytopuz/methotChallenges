public class Main {
    public static void main(String[] args) {
int highScorePosition=calculateHighScorePosition(1500);
displayHighScorePosition("Koray",highScorePosition);
        highScorePosition=calculateHighScorePosition(1000);
        displayHighScorePosition("Krytopuz",highScorePosition);
        highScorePosition=calculateHighScorePosition(500);
        displayHighScorePosition("kry",highScorePosition);
        highScorePosition=calculateHighScorePosition(100);
        displayHighScorePosition("Topuz",highScorePosition);
        highScorePosition=calculateHighScorePosition(25);
        displayHighScorePosition("KorayTopuz",highScorePosition);
    }

    public static void displayHighScorePosition(String playerName ,int highScorePosition)
    {
        System.out.println(playerName+" managet to into position "+
                highScorePosition+" on the highscore list ");
    }
    public static int calculateHighScorePosition (int playerScore){
        int position=4;
        if (playerScore>=1000){
           position=1;

        } else if (playerScore>=500&& playerScore<1000) {
            position=2;
        } else if (playerScore >=100&& playerScore<500) {
            position=3;
        }
            return position;
    }
}