
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bharath
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the length of firt land tract");
        int length1 = scanner.nextInt();
        System.out.print("enter the width of firt land tract");
        int width1 = scanner.nextInt();

        System.out.print("enter the length of second land tract");
        int length2 = scanner.nextInt();
        System.out.print("enter the width of second land tract");
        int width2 = scanner.nextInt();

        LandTract landtract1 = new LandTract(length1, width1);
        LandTract landtract2 = new LandTract(length2, width1);
        System.out.println("LandTract with lenth" + landtract1.length + ",width " + landtract1.width + ", and area " + landtract1.area());
        System.out.println("LandTract with lenth" + landtract2.length + ",width " + landtract2.width + ", and area " + landtract2.area());
 if(landtract1.equals(landtract2)){
    System.out.print("the two tracts have the same size ");
 }
 else{
         System.out.print("the two tracts do not have the same size ");

 }
    }

    
}
