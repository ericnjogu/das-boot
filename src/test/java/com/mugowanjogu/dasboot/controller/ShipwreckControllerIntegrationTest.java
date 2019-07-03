/**
 * 
 */
package com.mugowanjogu.dasboot.controller;

import static org.junit.Assert.fail;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.greaterThan;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mugowanjogu.dasboot.model.Shipwreck;

/**
 * @author @mugowanjogu
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ShipwreckControllerIntegrationTest {
	
	@Autowired
	private ShipwreckController controller;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.mugowanjogu.dasboot.controller.ShipwreckController#list()}.
	 */
	@Test
	public void testList() {
		Collection<Shipwreck> list = controller.list();
		assertThat(list, is(notNullValue()));
		assertThat(list.size(), is(greaterThan(0)));
	}

	/**
	 * Test method for {@link com.mugowanjogu.dasboot.controller.ShipwreckController#update(com.mugowanjogu.dasboot.model.Shipwreck)}.
	 */
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.mugowanjogu.dasboot.controller.ShipwreckController#create(com.mugowanjogu.dasboot.model.Shipwreck)}.
	 */
	@Test
	public void testCreate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.mugowanjogu.dasboot.controller.ShipwreckController#get(java.lang.Long)}.
	 */
	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

}
