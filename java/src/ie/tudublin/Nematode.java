package ie.tudublin;

import javax.swing.text.TableView.TableRow;

import processing.core.PApplet;


public class Nematode 
{
    
    private String displayName;
    private int length;
    private int limbs;
    private String gender;
    private int eyes;


    private static processing.data.TableRow tr;

    public Nematode(processing.data.TableRow rowTableRow){

        this(
            tr.getString("name"),
            tr.getInt("length"),
            tr.getInt("limbs"),
            tr.getString("gender"),
            tr.getInt("eyes") 
        );

        
    
    }



    public Nematode(String displayName, int length, int limbs, String gender, int eyes ) 
    {
        this.displayName = displayName;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }

    public String getDisplayName(){
        return displayName;
    }

    public int getLength(){
        return length;
    }

    public int getLimbs(){
        return limbs;
    }

    public String getGender(){
        return gender;
    }

    public int getEyes(){
        return eyes;
    }

    public String toString() {

        return null;

    }

    public void add(Nematode nematode) {
    }

}