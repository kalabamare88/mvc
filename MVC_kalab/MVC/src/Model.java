import java.awt.*;


public class Model {

	private int pointCount;

	private Point[] points;
	

	private Color selectedColor;
	
	public Model() {
		pointCount = 0;
		points = new Point[10000];
		selectedColor = Color.CYAN;
	}
	

	public void addPoint(Point point) {
		// doesn't avoid out-of-bounds errors
		points[pointCount] = point;
		pointCount++;
	}
	

	public Point getPoint(int i) {
		if (i >= 0 && i < pointCount) {
			// probably should return a new point so that the return
			// value cannot be used to change the array element
			return points[i];
		}
		return null;
	}
	

	public void setSelectedColor(Color color) {
		selectedColor = color;
	}
	

	public Color getSelectedColor() {
		return selectedColor;
	}
}
