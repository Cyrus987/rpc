import java.util.*;
/**
 * Each player or team will create their own Player, this is only an example....
 * 
 * Your code MUST INCLUDE a move method with the following signature. To insure that, you must implement
 * the Player interface
 * 
 * You can create additional methods but must have the move method
 * 
 */
public class sixDevinneyCyrus implements Player
{
    private static String name = "sixDevinneyCyrus";
    /**
     * An example of a method - replace this comment with your own
     * You must create some kind of logic of what to play against your opponent...start thinking!
     * 
     * @return      the move you want to play against opponent
     *              "r" - rock
     *              "p" - paper
     *              "s" - scissors
     *              anything else - forfeit the turn
     */
    private static String plan = "paper then all rock";
    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore)
    {
        if(myMoves.length == 0)
        return "p";
        else {
        return "r";}
    }
    /**
     * Returns the name of the player
     * 
     * @return      the name of the player              
     */
    public String getName()
    {
        return name;
    }
}

