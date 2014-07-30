package main;
import it.randomtower.engine.ME;
import it.randomtower.engine.World;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import entities.Land;

import java.util.Random;
public class GameWorld extends World{
	Random rand = new Random();
	Input input = container.getInput();
	public GameWorld(int id, GameContainer container) throws SlickException 
	{		
		super(id, container);	
		ME.keyToggleDebug = Input.KEY_1;	
	}
	@Override
	public void init(GameContainer container, StateBasedGame game)throws SlickException 
	{
		super.init(container, game);
		add(new Land(0,0));

	}
	public void update(GameContainer container, StateBasedGame game, int delta)throws SlickException
	{
		super.update(container, game, delta);


	}
	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g)throws SlickException
	{
		super.render(container, game, g);
		g.setBackground(Color.white);

		
	}

}