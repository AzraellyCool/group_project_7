public class BoardGame extends Game
{
	private int totalPlayers;
	private boolean canEndInTie;

	public BoardGame(String description, int totalPlayers, boolean canEndInTie)
	{
		super(description);
		this.totalPlayers = totalPlayers;
		this.canEndInTie = canEndInTie;

	}
	public String toString()
	{
		String playerNum = "# Players: " + this.totalPlayers;
		String canTie = "Can end in tie: " + this.canEndInTie;
		return super.toString() + "\n" + playerNum + "\n" + canTie;
	}
}