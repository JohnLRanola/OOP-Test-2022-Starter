package ie.tudublin;

import processing.data.TableRow;


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

    public String getDisplayName(){
        return displayName;
    }

    public int getLength(){
        return length;
    }

    public boolean getLimbs(){
        return limbs;
    }

    public String getGender(){
        return gender;
    }

    public boolean getEyes(){
        return eyes;
    }

    public void add(Nematode nematode) {
    }

}