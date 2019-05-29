import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;


public class PaintPanel extends JPanel {

	private Model model;

	public PaintPanel(Model model) {
		this.model = model;
	} // end PaintPanel constructor


	public void paintComponent(Graphics g) {
		super.paintComponent(g); // clears drawing area
		int i = 0;
		Point point = model.getPoint(0);
		while (point != null) {
			g.fillOval(point.x, point.y, 4, 4);
			i++;
			point = model.getPoint(i);
		}
	}
}
