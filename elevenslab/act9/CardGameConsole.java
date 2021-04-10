/**
 * This class provides a console based UI for solitaire games related to Elevens.
 */
public class CardGameConsole
{
  private Board board;

  public CardGameConsole(Board gameBoard)
  {
    /* TO BE IMPLEMENTED IN ACT 12 */
  }

  /**
   * Given a board (in the ctor), play a game via the console
   */
  public void playGame()
  {
    /* TO BE IMPLEMENTED IN ACT 12 */
  }

  /**
   * Called by playGame to display the current board state including:
   *  - the cards on the board and their indexes
   *  - the number of cards remaining in the deck
   */
  private void displayBoard()
  {
    /* TO BE IMPLEMENTED IN ACT 12 */
  }

  /**                                                                             
   * Called by playGame to checks if selectedCards indexes are within 
   * bounds and do not reference a null card
   */
  private boolean validSelection(List<Integer> selectedCards)
  {
    /* TO BE IMPLEMENTED IN ACT 12 */
  }

}
