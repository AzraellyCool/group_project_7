public class BorderlandsPCGameTest
{
    public static void main(String[] args)
    {
        BorderlandsCharacter character = BorderlandsCharacter.LILITH;
        BorderlandsDifficultyMode difficulty = BorderlandsDifficultyMode.VERY_HARD;

        Borderlands game = new Borderlands(character, difficulty);

        System.out.println(game.toString());
    }
}
