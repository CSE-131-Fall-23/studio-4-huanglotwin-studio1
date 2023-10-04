package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color pink = new Color(255,192,203);
		StdDraw.setPenColor(pink);
		StdDraw.filledRectangle(.5, .5, .5, .3);
		
		Color white = new Color(255,255,255); 
		StdDraw.setPenColor(white); 
		StdDraw.filledCircle(.8, .2, .2);
		
		
	}
}