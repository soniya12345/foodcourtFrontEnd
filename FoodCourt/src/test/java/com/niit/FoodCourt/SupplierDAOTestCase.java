package com.niit.FoodCourt;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.FoodCourt.dao.SupplierDAO;
import com.niit.FoodCourt.model.Supplier;


public class SupplierDAOTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static SupplierDAO supplierDAO;
	@Autowired
	static Supplier supplier;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		// get the categoryDAO from context
		supplierDAO = (SupplierDAO) context.getBean("supplierDAO");

		// get the category from context

		supplier = (Supplier) context.getBean("supplier");

	}

	/*@Test
	public void createSupplierTestCase() {
		supplier.setId("SP_Univercell");
		supplier.setName("Univercell Mobiles");
		supplier.setAddress("Anantapur");

		boolean flag = supplierDAO.save(supplier);

		assertEquals("createSupplierTestCase", true, flag);

	}

	/*@Test
	public void updateSupplierTestCase() {
		supplier.setId("SP_Reliance");
		supplier.setName("Reliance Mobiles");
		supplier.setAddress("Bangalore");

		boolean flag = supplierDAO.update(supplier);

		assertEquals("updateSupplierTestCase", true, flag);

	}

	@Test
	public void listAllSupplierTestCase() {
		int actualSize = supplierDAO.list().size();
		assertEquals(6, actualSize);
	}*/

}
