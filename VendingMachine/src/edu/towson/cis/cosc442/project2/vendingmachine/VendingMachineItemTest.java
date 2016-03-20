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
 */;
public class VendingMachineItemTest {
	private VendingMachineItem item;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		item = new VendingMachineItem("This", 32.0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		item = null;
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem#VendingMachineItem(java.lang.String, double)}.
	 * Testing that an exception is thrown when attempting to construct a VendingMachineItem with a price less than 0
	 */
	@Test (expected = VendingMachineException.class)
	public void testVendingMachineItem() {
		VendingMachineItem vItem = new VendingMachineItem("This", -4.5);
	}	
	
	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem#getName()}.
	 */
	@Test
	public void testGetName() {
		assertEquals("This",item.getName());
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem#getPrice()}.
	 */
	@Test
	public void testGetPrice() {
		assertEquals(32.00,item.getPrice(),0.001);
	}

}
