/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bharath
 */
public class LandTract {
    
    int length; 
     int  width;

    public LandTract(int length, int width) {
        this.length = length;
        this.width = width;

    }
    public int area(){
        return length*width;
            }
    public boolean equals(Object O){
        if(this == O) 
            return true;
        if (O == null || getClass() != O.getClass()) 
            return false;
        LandTract LandTract = (LandTract) O;
        return(length == LandTract.length && width == LandTract.width) || (width == LandTract.length && length == LandTract.width);
    }
    public String toString(){
        return "LandTract Object with length "+length+" and width "+width;
    }
    
}
