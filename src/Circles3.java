import acm.program.*;
import acm.util.*;

import java.awt.Color;

import acm.graphics.*;
public class Circles3 extends GraphicsProgram {
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			Color color = new Color((int) (Math.random() * 0x1000000));
			int Radius = rgen.nextInt(5,50);
			int x1 = rgen.nextInt(0, getHeight()/4);
			int y1 = rgen.nextInt(0, getWidth()/2);
			Circles = new GOval(x1 , y1, Radius ,Radius);
			Circles.setFillColor(color);
			Circles.setFilled(true);
			println(i);
			add(Circles);
			
		}
		
		
	}
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GOval Circles;
	

}
