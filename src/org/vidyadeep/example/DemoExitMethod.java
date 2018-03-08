/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vidyadeep.example;

/**
 *
 * @author Vidyadeep
 */
public class DemoExitMethod {

    /**
     * @param args the command line arguments
     */
    //Define a method to get sum of 2 nos and print it according to the no of 
    //count.
    private void showSum(double x, double y,int count){
        //Define a for-loop to know the no of times sum gets print.
        double sum = x + y;
        if(count < 1){
            System.out.println("Error-Count less than 0");
            return; 
        }   
        for(int i=0; i<count;i++)
            System.out.println(sum);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //Create one object of the DemoExitMethod class.
        DemoExitMethod obj1 = new DemoExitMethod();
        
        //Call showSum method on that object.
        obj1.showSum(3.2, 2.5, 0);
        
        System.out.println("I'm Back");
    }   
}
