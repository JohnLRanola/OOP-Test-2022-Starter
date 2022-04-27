package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	
	ArrayList<Nematode> nematode = new ArrayList<Nematode>();

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);
		loadNematodes();
		printNematode();
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();				
	}
	

	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");

		for(TableRow row:table.rows())
		{
			Nematode nematode = new Nematode(row);
			nematode.add(nematode);

		}
	}

	public void printNematode()
	{
		for(Nematode t:nematode)
		{
			println(t);
		}
	}

	float border = 40;

	public void drawNematode()
	{
		for(Nematode n:nematode)
		{
			n.render(this);
		}
	}
	

	public void draw()
	{	
		background(0);
		drawNematode();

	}
}
