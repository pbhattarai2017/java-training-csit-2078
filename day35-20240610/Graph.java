import java.awt.*;

class GraphCanvas extends Canvas {
	@Override
	public void paint(Graphics g) {
		
	}
}

public class Graph {
	public static void main(String[] args) {
		Frame frame = new Frame("Graph visualizer");
		Di
		GraphCanvas canvas = new GraphCanvas();
		
		frame.setSize(600,400);
		frame.add(canvas);
		frame.setBackground(Color.WHITE);
		frame.setVisible(true);
		
	}
}

