package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {

	/*
	 * For BubbleSort
	 * This method tests node and edge coverage
	 */
	@Test(expected = NullPointerException.class)
	public void bubbleSortWithEmptyList() {
		Item[] inputArray = new Item[1];
		inputArray[0] = new Item((Integer) null);
		SortAlgos.bubbleSort(inputArray);
	}
	
	/*
	 * This method tests edge and condition coverage
	 */
	@Test
	public void bubbleSortWithSingleElement() {
		Item[] inputArray = new Item[1];
		inputArray[0] = new Item(5);
		Item[] outputArray = new Item[1];
		outputArray[0] = new Item(5);
		SortAlgos.bubbleSort(inputArray);
		for(int i = 0; i<outputArray.length; i++){
			assertEquals(outputArray[i].key,inputArray[i].key);
		}
	}
	
	/*
	 * This method tests node and edge coverage
	 */
	@Test
	public void bubbleSortWithMultiElements() {
		Item[] inputArray = new Item[3];
		inputArray[0] = new Item(5);
		inputArray[1] = new Item(1);
		inputArray[2] = new Item(2);
		Item[] outputArray = new Item[3];
		outputArray[0] = new Item(1);
		outputArray[1] = new Item(2);
		outputArray[2] = new Item(5);
		SortAlgos.bubbleSort(inputArray);
		for(int i = 0; i<outputArray.length; i++){
			assertEquals(outputArray[i].key,inputArray[i].key);
		}
	}
	
	@Test
	public void bubbleSortWithMixedElements() {
		Item[] inputArray = new Item[4];
		inputArray[0] = new Item(5);
		inputArray[1] = new Item(-1);
		inputArray[2] = new Item(2);
		inputArray[3] = new Item(5);
		Item[] outputArray = new Item[4];
		outputArray[0] = new Item(-1);
		outputArray[1] = new Item(2);
		outputArray[2] = new Item(5);
		outputArray[3] = new Item(5);
		SortAlgos.bubbleSort(inputArray);
		for(int i = 0; i<outputArray.length; i++){
			assertEquals(outputArray[i].key,inputArray[i].key);
		}
	}
	/*
	 * For Selection Sort
	 */
	@Test(expected = NullPointerException.class)
	public void selectionSortWithEmptyList() {
		Item[] inputArray = new Item[1];
		inputArray[0] = new Item((Integer) null);
		SortAlgos.selectionSort(inputArray);
	}
	
	@Test
	public void selectionSortWithMultiElements() {
		Item[] inputArray = new Item[5];
		inputArray[0] = new Item(5);
		inputArray[1] = new Item(1);
		inputArray[2] = new Item(2);
		inputArray[3] = new Item(6);
		inputArray[4] = new Item(8);
		Item[] outputArray = new Item[5];
		outputArray[0] = new Item(1);
		outputArray[1] = new Item(2);
		outputArray[2] = new Item(5);
		outputArray[3] = new Item(6);
		outputArray[4] = new Item(8);
		SortAlgos.selectionSort(inputArray);
		for(int i = 0; i<outputArray.length; i++){
			assertEquals(outputArray[i].key,inputArray[i].key);
		}
	}
	
	/*
	 * For Insertion Sort
	 */
	@Test(expected = NullPointerException.class)
	public void insertionSortWithEmptyList() {
		Item[] inputArray = new Item[1];
		inputArray[0] = new Item((Integer) null);
		SortAlgos.insertionSort(inputArray);
	}
	
	@Test
	public void insertionSortWithMultiElements() {
		Item[] inputArray = new Item[5];
		inputArray[0] = new Item(5);
		inputArray[1] = new Item(1);
		inputArray[2] = new Item(2);
		inputArray[3] = new Item(6);
		inputArray[4] = new Item(8);
		Item[] outputArray = new Item[5];
		outputArray[0] = new Item(1);
		outputArray[1] = new Item(2);
		outputArray[2] = new Item(5);
		outputArray[3] = new Item(6);
		outputArray[4] = new Item(8);
		SortAlgos.insertionSort(inputArray);
		for(int i = 0; i<outputArray.length; i++){
			assertEquals(outputArray[i].key,inputArray[i].key);
		}
	}
	
	/*
	 * For Merge Sort
	 */
	@Test(expected = NullPointerException.class)
	public void mergeSortWithEmptyList() {
		Item[] inputArray = new Item[1];
		inputArray[0] = new Item((Integer) null);
		SortAlgos.mergeSort(inputArray);
	}
	
	@Test
	public void mergeSortWithSingleElement() {
		Item[] inputArray = new Item[1];
		inputArray[0] = new Item(5);
		Item[] outputArray = new Item[1];
		outputArray[0] = new Item(5);
		SortAlgos.mergeSort(inputArray);
		for(int i = 0; i<outputArray.length; i++){
			assertEquals(outputArray[i].key,inputArray[i].key);
		}
	}
	
	@Test
	public void mergeSortWithMultiElements() {
		Item[] inputArray = new Item[5];
		inputArray[0] = new Item(5);
		inputArray[1] = new Item(1);
		inputArray[2] = new Item(2);
		inputArray[3] = new Item(6);
		inputArray[4] = new Item(8);
		Item[] outputArray = new Item[5];
		outputArray[0] = new Item(1);
		outputArray[1] = new Item(2);
		outputArray[2] = new Item(5);
		outputArray[3] = new Item(6);
		outputArray[4] = new Item(8);
		SortAlgos.mergeSort(inputArray);
		for(int i = 0; i<outputArray.length; i++){
			assertEquals(outputArray[i].key,inputArray[i].key);
		}
	}
	
	/*
	 * For Quick Sort
	 */
	@Test(expected = NullPointerException.class)
	public void quickSortWithEmptyList() {
		Item[] inputArray = new Item[1];
		inputArray[0] = new Item((Integer) null);
		SortAlgos.quickSort(inputArray);
	}
	
	@Test
	public void quickSortWithSingleElement() {
		Item[] inputArray = new Item[1];
		inputArray[0] = new Item(5);
		Item[] outputArray = new Item[1];
		outputArray[0] = new Item(5);
		SortAlgos.quickSort(inputArray);
		for(int i = 0; i<outputArray.length; i++){
			assertEquals(outputArray[i].key,inputArray[i].key);
		}
	}
	
	@Test
	public void quickSortWithTwoElements() {
		Item[] inputArray = new Item[2];
		inputArray[0] = new Item(5);
		inputArray[1] = new Item(1);
		Item[] outputArray = new Item[2];
		outputArray[0] = new Item(1);
		outputArray[1] = new Item(5);
		SortAlgos.quickSort(inputArray);
		for(int i = 0; i<outputArray.length; i++){
			assertEquals(outputArray[i].key,inputArray[i].key);
		}
	}
	
	@Test
	public void quickSortWithMultiElements() {
		Item[] inputArray = new Item[5];
		inputArray[0] = new Item(5);
		inputArray[1] = new Item(1);
		inputArray[2] = new Item(2);
		inputArray[3] = new Item(6);
		inputArray[4] = new Item(8);
		Item[] outputArray = new Item[5];
		outputArray[0] = new Item(1);
		outputArray[1] = new Item(2);
		outputArray[2] = new Item(5);
		outputArray[3] = new Item(6);
		outputArray[4] = new Item(8);
		SortAlgos.quickSort(inputArray);
		for(int i = 0; i<outputArray.length; i++){
			assertEquals(outputArray[i].key,inputArray[i].key);
		}
	}
	
	/*
	 * For Heap Sort
	 */
	@Test(expected = NullPointerException.class)
	public void heapSortWithEmptyList() {
		Item[] inputArray = new Item[1];
		inputArray[0] = new Item((Integer) null);
		SortAlgos.heapSort(inputArray);
	}
	
	@Test
	public void heapSortWithSingleElement() {
		Item[] inputArray = new Item[1];
		inputArray[0] = new Item(5);
		Item[] outputArray = new Item[1];
		outputArray[0] = new Item(5);
		SortAlgos.heapSort(inputArray);
		for(int i = 0; i<outputArray.length; i++){
			assertEquals(outputArray[i].key,inputArray[i].key);
		}
	}
	
	@Test
	public void heapSortWithMultiElements() {
		Item[] inputArray = new Item[5];
		inputArray[0] = new Item(5);
		inputArray[1] = new Item(1);
		inputArray[2] = new Item(2);
		inputArray[3] = new Item(6);
		inputArray[4] = new Item(8);
		Item[] outputArray = new Item[5];
		outputArray[0] = new Item(1);
		outputArray[1] = new Item(2);
		outputArray[2] = new Item(5);
		outputArray[3] = new Item(6);
		outputArray[4] = new Item(8);
		SortAlgos.heapSort(inputArray);
		for(int i = 0; i<outputArray.length; i++){
			assertEquals(outputArray[i].key,inputArray[i].key);
		}
	}
	
	/*
	 * For default constructor of the class
	 */
	 @Test 
	 public void defaultConstructortest() { 
	  new SortAlgos(); 
	 } 
}

