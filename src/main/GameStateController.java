package main;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;


public class GameStateController extends StateBasedGame {
  
	public static int ID = 0;
    public static int GO = 0;

    
	public GameStateController() {
        super("ZOMBIE ALPACALYPSE");
      
    }
	public void initStatesList(GameContainer container) throws SlickException {
        addState(new Title(0,container));
        addState(new GameWorld(1,container));
    }


}