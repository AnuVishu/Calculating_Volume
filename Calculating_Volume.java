/*
 * The code below is one of the approach to the solution and is not exact
 * CALCULATING VOLUME
 * HackerRank Problem Challenges
 * Problem URL: https://www.hackerrank.com/challenges/calculating-volume
 */
package hackerrank_java2;
import java.util.*;
import java.math.*;

public class HackerRank_java2 {

    
    static Scanner input;
    
    public static void main(String[] args) {
        input = new Scanner(System.in);
        
        int test_case;
        double cube_length;
        double cube_volume;
        
        double cuboidLength, cuboidBreadth, cuboidHeight;
        double cuboid_volume;
        
        double hami_radius;
        double hami_Volume;
        
        double cylinder_radius;
        double cylinder_height;
        double cylinder_volume;
         
        test_case = input.nextInt();
        int[] choice=new int[test_case];
        
        for(int i=0 ; i<test_case ; ++i) {
            choice[i] = input.nextInt();
            switch(choice[i]) {
                
                case 1: 
                    try{
                        
                        cube_length = input.nextDouble();
                        
                        if(cube_length <= 0)
                            throw new java.lang.NumberFormatException();
                        
                        cube_volume = (cube_length*cube_length)*cube_length;
                    
                        System.out.println(cube_volume);
                    }
                    
                    catch(java.lang.NumberFormatException e){
                        System.out.println(e + " No Negative Value Permitted");
                    }
                    break;
                
                case 2:
                    try{
                        
                        cuboidLength = input.nextDouble();
                        cuboidBreadth = input.nextDouble();
                        cuboidHeight = input.nextDouble();
                        
                        if(cuboidLength < 0 || cuboidBreadth < 0 || cuboidHeight < 0)
                            throw new java.lang.NumberFormatException();
                                                    
                        cuboid_volume = (cuboidLength)*(cuboidBreadth)*(cuboidHeight);
                        System.out.println(cuboid_volume);
                    }
                    
                    catch(java.lang.NumberFormatException e){
                        System.out.println(e + " No Values Can Be Nagetive");
                    }                   
                    break;
                    
                case 3:
                    try{
                        
                        hami_radius = input.nextDouble();
                        
                        if(hami_radius < 0)
                            throw new java.lang.NumberFormatException();
                        
                        hami_Volume = (2/4)*(Math.PI)*hami_radius;
                        System.out.println(hami_Volume);
                    }
                    
                    catch(java.lang.NumberFormatException e){
                        System.out.println(e + " No nagetive values allowed");
                    }
                    break;
                    
                case 4:
                    try{   
                        
                        cylinder_radius = input.nextDouble();
                        cylinder_height = input.nextDouble();
                        
                        if(cylinder_radius < 0 || cylinder_height < 0){
                            throw new java.lang.NumberFormatException();
                        }
                        else{                    
                            cylinder_volume = (Math.PI)*Math.sqrt(cylinder_radius)*cylinder_height;                    
                            System.out.println(cylinder_volume);
                        }
                    }
                    
                    catch(java.lang.NumberFormatException e){
                        System.out.println(e + " All Values Must Be Positive");
                    }                   
                    break;
                    
                default: 
                    System.out.println("Wrong Choice!!");
            }
        }
    }
}
