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

	private float border = 40;
	
	void displayNematodes()
	{
		float y = border + border;

		textSize(14);
		textAlign(CENTER, CENTER);

		stroke(128);

		for(int i = 0; i < nematode.size(); i++)
		{
			text(nematode.get(i).getDisplayName(), border, y);
		}

		noStroke();
	}

	public void draw()
	{	
		background(0);

	}
}
