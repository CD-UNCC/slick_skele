package entities;
import it.randomtower.engine.entity.Entity;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Land extends Entity{
	public Land(float x, float y) throws SlickException{
		super(x, y);
		Image Land = new Image("Images/Land.png");
		setGraphic(Land);
		System.out.println("x= " + x + "  " + "y= " + y);
	    depth = 0;
	}
}
