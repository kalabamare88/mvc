import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;


public class Controller implements ListSelectionListener, MouseMotionListener {

	private Model model;
	

	private View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}


	public void mouseDragged(MouseEvent event) {
		Point point = event.getPoint(); // find point
		model.addPoint(point);
		view.repaint();
	} // end method mouseDragged


	public void mouseMoved(MouseEvent event) {
		// this method intentionally left blank
	}


	public void valueChanged(ListSelectionEvent event) {
		Color color = view.getSelectedColor();
		model.setSelectedColor(color);
		view.repaint();
	}
}
