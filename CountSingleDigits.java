/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countsingledigits;

import java.util.Arrays;

/**
 *
 * @author sa
 */
public class CountSingleDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers=0;
        
        int[] arr = new int[10];
        
        
        for (int i = 0; i < 10; i++) {
             numbers = (int)(Math.random()*10);
             System.out.println(numbers);
             
             arr[i]=numbers;
             
             
        
        }
        System.out.println("numbers are "+Arrays.toString(arr));
        countOccurence(arr);
        
        
    }
    public static void countOccurence(int[] frequency){
        
        int visited=-1;
        int[] newArray = new int[frequency.length];
        
        for (int i = 0; i < frequency.length; i++) {
            int count=1;
            for (int j = i+1; j < frequency.length; j++) {
                if(frequency[i]==frequency[j]){
                    //count++;
                    newArray[j]=visited;
                    
                   
                }
                
            }
           
            if(newArray[i] != visited){
               newArray[i]=count; 
               
            }
            
        }
        for (int i = 0; i < newArray.length; i++) {
               if(newArray[i] != visited) {
                 System.out.println("the number "+ frequency[i]+" frequency is "+ newArray[i]);
            }
           
        }
        
    }
}
