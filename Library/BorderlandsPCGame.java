public class BorderlandsPCGame extends PCGame
{
    private BorderlandsCharacter character;
    private BorderlandsDifficultyMode difficulty;

    public BorderlandsPCGame(BorderlandsCharacter character, BorderlandsDifficultyMode difficulty)
    {
        super("Borderlands", 1000, 8000, 2.4);
        this.character = character;
        this.difficulty = difficulty;
    }

    public String toString()
    {
        return super.toString()
                + "\nCharacter: " + this.character
                + "\nDifficulty: " + this.difficulty;
    }
}
