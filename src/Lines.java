import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;
public class Lines extends GraphicsProgram {
	public void run () { addMouseListeners();
	}
	private GLine line1;
	
	public void mousePressed(MouseEvent e) {
	line1 = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
	add(line1);
	}
	public void mouseDragged(MouseEvent e) {
	line1.setEndPoint(e.getX(), e.getY());
	}

}
