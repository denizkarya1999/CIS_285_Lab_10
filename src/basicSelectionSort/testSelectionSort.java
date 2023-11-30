package basicSelectionSort;

/*
* testSelectionSort.java
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
*/

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

   public testSelectionSort() {
   }
   
   public void testPositive(){
       int[] arr = new int[5];
       arr[0] = 8;
       arr[1] = 9;
       arr[2] = 7;
       arr[3] = 10;
       arr[4] = 2;
       
       int[] Sortedarr = new int[5];
       Sortedarr[0] = 2;
       Sortedarr[1] = 7;
       Sortedarr[2] = 8;
       Sortedarr[3] = 9;
       Sortedarr[4] = 10;
       
       /** add tests to check for this unit test **/
   }
   
   public void testNegative(){
       
       /** Test data contains negative values only **/
   }
   
   @Test
   public void testMixed(){
       
       // Arrange
	   int[] arr = new int[5];
       arr[0] = 8;
       arr[1] = -9;
       arr[2] = -7;
       arr[3] = 10;
       arr[4] = -2;
       
       int[] Sortedarr = new int[5];
       Sortedarr[0] = -9;
       Sortedarr[1] = -7;
       Sortedarr[2] = -2;
       Sortedarr[3] = 8;
       Sortedarr[4] = 10;
       
	   // Act
       SelectionSort sort = new SelectionSort();
       int[] resultArray = sort.basicSelectionSort(arr);
	   
	   // Assert
       for(int a = 0; a < resultArray.length; a++) {
    	   assertEquals(Sortedarr[a], resultArray[a]);
       }
   }
   
   @Test
   public void testDuplicates(){
	// Arrange
	   int[] arr = new int[5];
       arr[0] = 10;
       arr[1] = -9;
       arr[2] = 11;
       arr[3] = -9;
       arr[4] = 1;
       
       int[] Sortedarr = new int[5];
       Sortedarr[0] = -9;
       Sortedarr[1] = -9;
       Sortedarr[2] = 1;
       Sortedarr[3] = 10;
       Sortedarr[4] = 11;
       
    // Act
       SelectionSort sort = new SelectionSort();
       int[] resultArray = sort.basicSelectionSort(arr);
	   
	   // Assert
       for(int a = 0; a < resultArray.length; a++) {
    	   assertEquals(Sortedarr[a], resultArray[a]);
       }
   }


}
