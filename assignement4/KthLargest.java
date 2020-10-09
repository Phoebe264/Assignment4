/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement4;

/**
 *
 * @author litong
 */
public class KthLargest {

    public static void main(String[] args) {
        int[] array = {13,45,32,5,7,12,47,87,43,23,10};
        int k = 2;
        int output = findKthLargest(array,k);
        System.out.println(k+"th Largest Element: "+output);
        
        k = 4;
        output = findKthLargest(array,k);
        System.out.println(k+"th Largest Element: "+output);
        
        k = 1;
        output = findKthLargest(array,k);
        System.out.println(k+"th Largest Element: "+output);
        
        k = 6;
        output = findKthLargest(array,k);
        System.out.println(k+"th Largest Element: "+output);
        
        k = array.length-1;
        output = findKthLargest(array,k);
        System.out.println(k+"th Largest Element: "+output);
        
    }

    public static int findKthLargest(int[] array, int k) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[k-1];
    }
}
