import java.awt.*;

class MyCanvas extends Canvas {
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(50,50,10,10);
	}
}

public class Visual {

	public static void main(String[] args) {
		Frame frame = new Frame("Graphics");

		MyCanvas c = new MyCanvas();
		c.setSize(400,300);
		
		frame.setBackground(Color.BLUE);
		frame.add(c);
		frame.setSize(400,400);
		frame.setVisible(true);
	}
}

