package demos;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

/** 
 * A class to illustrate some use of the PApplet class
 * Used in module 3 of the UC San Diego MOOC Object Oriented Programming in Java
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * 
 *
 */
public class Buttons extends PApplet{

	private static final long serialVersionUID = 1L;

	// You can ignore this.  It's to keep eclipse from generating a warning.
	//private static final long serialVersionUID = 1L;

	// IF YOU ARE WORKING OFFLINE, change the value of this variable to true
	private static final boolean offline = false;

	/** This is where to find the local tiles, for working without an Internet connection */
	public static String mbTilesString = "blankLight-1-3.mbtiles";
	
	// The map
	private UnfoldingMap map;
	
	
	public void setup() {
		size(950, 600, OPENGL);

		// Assume online
		map = new UnfoldingMap(this, 200, 50, 700, 500, new Google.GoogleMapProvider());
//		map = new UnfoldingMap(this, 200, 50, 700, 500, new OpenStreetMap.OpenStreetMapProvider() );
//	    map = new UnfoldingMap(this, 200, 50, 650, 600, new MBTilesMapProvider(mbTilesString));

	    MapUtils.createDefaultEventDispatcher(this, map);
	}
	
	public void draw() {
	    map.draw();
	    drawButtons();
	}
	
	public void drawButtons() {
		fill(255,255,255);
		rect(100,100,25,25);
		
		fill(100,100,100);
		rect(100,150,25,25);
	}
	
	public void mousePressed() {
		
	}
	
	public void mouseClicked() {
		
	}
	
	public void mouseReleased() {
		if (mouseX >100 && mouseX < 125 && mouseY > 100 && mouseY < 125) {
			background(255,255,255);
		}
		else if (mouseX > 100 & mouseX < 125 && mouseY > 150 && mouseY < 175){
			background(100,100,100);
		}
	}
}