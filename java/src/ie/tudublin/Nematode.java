package ie.tudublin;

import processing.data.TableRow;
import processing.core.PApplet;


public class Nematode 
{
    
    private String displayName;
    private int length;
    private boolean limbs;
    private String gender;
    private boolean eyes;

    @Override
    public String toString() {

        return "Nematode [displayName=" + displayName + ", length=" + length + ", limbs=" + limbs
        + ", gender=" + gender + ", eyes=" + eyes + "]";

    }

    public Nematode(TableRow row){

        this(
            row.getString("name"),
            row.getInt("length"),
            row.getInt("limbs") == 1,
            row.getString("gender"),
            row.getInt("eyes") == 1
        );

        
    
    }

    public Nematode(String displayName, int length, boolean limbs, String gender, boolean eyes ) 
    {
        this.displayName = displayName;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }

    public String getName() {
        return displayName;
    }
    public void setName(String name) {
        this.displayName = name;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public boolean isLimbs() {
        return limbs;
    }
    public void setLimbs(boolean limbs) {
        this.limbs = limbs;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public boolean isEyes() {
        return eyes;
    }
    public void setEyes(boolean eyes) {
        this.eyes = eyes;
    }
    public void add(Nematode nematode) {
    }

    public void render(NematodeVisualiser pa)
    {
        float x = PApplet.map(length, -5, 5, pa.border, pa.width - pa.border);
        float y = PApplet.map(length, -5, 5, pa.border, pa.height - pa.border);

        
        pa.stroke(255, 255, 0);
        pa.fill(255);
        pa.textSize(16);
        pa.textAlign(PApplet.LEFT, PApplet.CENTER);
        pa.text(displayName, x + 20, y);
    }


}