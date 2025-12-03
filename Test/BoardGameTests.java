public class BoardGameTests
{
	public static void main(String[] args)
	{

		//	TEST #1
		BoardGame t1 = new BoardGame("Connect one", 3, true);
		System.out.println("BoardGame.setDescription(String)");
		System.out.println("Test #1 - Updates descriptions properly.");
		System.out.println("Inital state: " + t1.getDescription());
		t1.setDescription("Connect two");
		System.out.println("Expected: Connect two");
		System.out.println("Actual: " + t1.getDescription() + "\n");

		//	TEST #2
		BoardGame t2 = new BoardGame("Candyland on fire", 4, false);
		System.out.println("BoardGame.toString()");
		System.out.println("Test #2 - Formats string correctly.");
		System.out.println("Expected: \nDescription: Candyland on fire \n# Players: 4 \nCan end in tie: false \n");
		System.out.println("Actual: \n" + t2 + "\n");
	}
}