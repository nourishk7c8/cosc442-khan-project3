/**
 * 
 */
package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Nourish Khan
 *
 */
public class VendingMachineTest {
	
	private VendingMachine vm;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		vm = new VendingMachine();
		vm.addItem(new VendingMachineItem("Item A", 1.34), "A");
		vm.addItem(new VendingMachineItem("Item C", 4.74), "C");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		vm = null;
	}
	
	/**
	 * Test that an exception is thrown when attempting to add an item to an already occupied slot in the vending machine
	 */
	@Test (expected= VendingMachineException.class)
	public void testAddItemToOccupiedSlot() {
		vm.addItem(new VendingMachineItem("A thing", 3.4), "A");
	}
	
	/**
	 * Test that an exception is thrown when attempting to add an item to a non-existent slot in the vending machine
	 */
	@Test (expected= VendingMachineException.class)
	public void testAddItemToNonExistentSlot() {
		vm.addItem(new VendingMachineItem("A thing", 3.4), "F");
	}
	
	/**
	 * Test that an item is added successfully into a specified slot
	 */
	@Test
	public void testAddItemSuccess() {
		VendingMachineItem item = new VendingMachineItem("Another thing", 2.3);
		vm.addItem(item, "B");
		assertEquals(item, vm.getItem("B"));
	}
	
	/**
	 * Test that an exception is thrown when attempting to remove an item from a slot when there is no item to remove
	 */
	@Test (expected= VendingMachineException.class)
	public void testRemoveItemFromEmptySlot() {
		vm.removeItem("D");
	}
	
	/**
	 * Test that an exception is thrown when attempting to remove an item from a non-existent slot
	 */
	@Test (expected= VendingMachineException.class)
	public void testRemoveItemFromNonExistentSlot() {
		vm.removeItem("G");
	}
	
	/**
	 * Test that an item is successfully removed from a slot when the slot is not empty
	 */
	@Test
	public void testRemoveItemSuccess(){
		vm.removeItem("A");
		assertNull(vm.getItem("A"));
	}
	
	/**
	 * Test that an exception is thrown when attempt to insert an amount that is 0 or negative
	 */
	@Test (expected = VendingMachineException.class)
	public void testInsertMoneyInvalidAmount(){
		vm.insertMoney(-4);
	}
	
	/**
	 * Test that money is successfully added to the vending machine when given a valid amount
	 */
	@Test
	public void testInsertMoneySuccess(){
		vm.insertMoney(5);
		assertEquals(5, vm.balance/*vm.getBalance()*/, 0.01);
		//wouldn't this also test getBalance() if I'd used it? Am I allowed to use the field balance in JUnit testing?
	}
	
	/**
	 * Tests that the correct value is returned when getBalance is called
	 */
	@Test
	public void testGetBalance(){
		vm.insertMoney(4.56);
		assertEquals(4.56, vm.getBalance(), 0.001);
	}
	
	/**
	 * Tests that if balance < the price of the item, false is returned by makePurchase()
	 */
	@Test
	public void testMakePurchaseNotEnoughBalance(){
		boolean purchase = vm.makePurchase("A");
		assertFalse(purchase);
	}
	
	/**
	 * Tests that if an invalid slot is entered, false is returned by makePurchase()
	 */
	@Test //(expected = VendingMachineException.class)
	public void testMakePurchaseInvalidSlot(){
		boolean purchase = vm.makePurchase("F");
		assertFalse(purchase);
	}
	
	/**
	 * Tests that a purchase is successfully made if the balance is <= to the price of the item o be purchased
	 */
	@Test
	public void testMakePurchaseSuccess(){
		vm.insertMoney(1.45);
		boolean purchase = vm.makePurchase("A");
		assertTrue(purchase);
	}
	
	@Test
	public void testReturnChange(){
		vm.insertMoney(1.25);
		vm.returnChange();
		assertEquals(0, vm.getBalance(), 0.001);
	}
	
	
}
