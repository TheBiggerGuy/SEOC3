/**
 * 
 */
package uk.ac.ed.inf.seoc.seoc3.internal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author guy
 *
 */
public class ProductStoreTest {
	
	ProductStore store;
	String itemName = "Test Item 1";	
	int id = -1;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		store = new ProductStore();
		assertEquals(0, store.numberOfProducts());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link uk.ac.ed.inf.seoc.seoc3.internal.ProductStore#addProduct(java.lang.String)}.
	 */
	@Test
	public final void testAddProduct() {
		int numberBefore = store.numberOfProducts();
		
		try {
			id = store.addProduct(itemName);
		} catch (Exception e) {
			fail("Failed to add Product");
		}
		
		assertEquals(numberBefore+1, store.numberOfProducts());
		
	}

	/**
	 * Test method for {@link uk.ac.ed.inf.seoc.seoc3.internal.ProductStore#getProduct(int)}.
	 */
	@Test
	public final void testGetProduct() {
		try {
			assertEquals(itemName, store.getProduct(id));
		} catch (Exception e) {
			fail("Failed to get new Product");
		}
	}
	
	/**
	 * Test method for {@link uk.ac.ed.inf.seoc.seoc3.internal.ProductStore#removeProduct(int)}.
	 */
	@Test
	public final void testRemoveProduct() {
		try {
			store.removeProduct(id);
		} catch (Exception e) {
			fail("Failed to get new Product");
		}
	}

	/**
	 * Test method for {@link uk.ac.ed.inf.seoc.seoc3.internal.ProductStore#updateProduct(int)}.
	 */
	@Test
	public final void testUpdateProduct() {
		fail("Not yet implemented"); // TODO
	}

}
