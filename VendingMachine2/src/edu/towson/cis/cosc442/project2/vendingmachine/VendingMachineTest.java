package edu.towson.cis.cosc442.project2.vendingmachine;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>VendingMachineTest</code> contains tests for the class <code>{@link VendingMachine}</code>.
 *
 * @generatedBy CodePro at 3/19/16 11:48 PM
 * @author Noshin
 * @version $Revision: 1.0 $
 */
public class VendingMachineTest {
	private VendingMachine fixture;
	
	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test
	public void testVendingMachine_1()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getBalance(), 1.0);
		assertEquals(0.0, result.returnChange(), 1.0);
	}

	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test
	public void testVendingMachine_2()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getBalance(), 1.0);
		assertEquals(0.0, result.returnChange(), 1.0);
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test
	public void testAddItem_Success()
		throws Exception {
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "B";

		fixture.addItem(item, code);
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test
	public void testAddItem_AlreadyFull()
		throws Exception {
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException.class)
	public void testAddItem_3()
		throws Exception {
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "F";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the double getBalance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test
	public void testGetBalance_1()
		throws Exception {
		fixture.balance = 1.0;

		double result = fixture.getBalance();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test
	public void testGetItem_1()
		throws Exception {
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException.class)
	public void testGetItem_2()
		throws Exception {
		fixture.balance = 1.0;
		String code = "D";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test
	public void testInsertMoney_1()
		throws Exception {
		fixture.balance = 1.0;
		double amount = 1.0;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException.class)
	public void testInsertMoney_2()
		throws Exception {
		fixture.balance = 1.0;
		double amount = -4.9E-324;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test
	public void testMakePurchase_1()
		throws Exception {
		fixture.balance = Double.MAX_VALUE;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test
	public void testMakePurchase_2()
		throws Exception {
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test
	public void testMakePurchase_3()
		throws Exception {
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException.class)
	public void testMakePurchase_4()
		throws Exception {
		fixture.balance = 1.0;
		String code = "";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_1()
		throws Exception {
		fixture.balance = 1.0;
		String code = "F";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_2()
		throws Exception {
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_3()
		throws Exception {
		fixture.balance = 1.0;
		String code = "D";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the double returnChange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Test
	public void testReturnChange_1()
		throws Exception {
		fixture.balance = 1.0;

		double result = fixture.returnChange();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		fixture = new VendingMachine();
		fixture.addItem(new VendingMachineItem("Item A", 1.34), "A");
		fixture.addItem(new VendingMachineItem("Item C", 4.74), "C");
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		fixture = null;
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/19/16 11:48 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VendingMachineTest.class);
	}
}