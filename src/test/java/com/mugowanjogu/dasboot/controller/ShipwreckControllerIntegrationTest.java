/**
 * 
 */
package com.mugowanjogu.dasboot.controller;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mugowanjogu.dasboot.model.Shipwreck;

/**
 * @author @mugowanjogu
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ShipwreckControllerIntegrationTest {
	
	@LocalServerPort
	private int port;
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
	 * Test method for {@link com.mugowanjogu.dasboot.controller.ShipwreckController#list()}.
	 * @throws IOException 
	 */
	@Test
	public void testList_REST() throws IOException {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:" + port + "/api/v1/wrecks/all", String.class);
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode responseJson = objectMapper.readTree(response.getBody());
		
		assertThat(responseJson.isMissingNode(), is(false));
		assertThat(responseJson.iterator().next().get("condition").toString(), not(isEmptyOrNullString()));
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
