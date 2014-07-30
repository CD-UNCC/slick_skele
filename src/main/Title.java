package main;
import it.randomtower.engine.ME;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.*;

public class Title extends BasicGameState {

	public Title(int id, GameContainer container) 
	{
		ME.keyToggleDebug = Input.KEY_1;
		
	}
	
	@Override
	 public void render(GameContainer container, StateBasedGame game, Graphics g)throws SlickException {	
	  Image Title = new Image("Images/Logo.png");
	  Title.draw(0, 0); 
	  g.setColor(Color.white);
	  g.setBackground(Color.black);
	  }
	

	
	@Override
	 public void update(GameContainer container, StateBasedGame sbg, int delta)throws SlickException 
	 {
		Input input = container.getInput();
		if(input.isKeyPressed(input.KEY_ENTER))
		{
			sbg.enterState(1, new FadeOutTransition(), new RotateTransition());
		}
	  
     }
	@Override
	public int getID() 
	{
		return 0;
	}

	@Override
	public void init(GameContainer arg0, StateBasedGame arg1)throws SlickException {
	
	}
}

