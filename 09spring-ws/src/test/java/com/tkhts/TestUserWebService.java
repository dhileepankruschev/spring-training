package com.tkhts;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.tkhts.webservices.getuserservices.GetUserRequest;
import com.tkhts.webservices.getuserservices.GetUserResponse;
import com.tkhts.webservices.getuserservices.ObjectFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("test/test-config.xml")
public class TestUserWebService {

	@Autowired
    private WebServiceTemplate webServiceTemplate;
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		GetUserRequest request = new ObjectFactory().createGetUserRequest();
		request.setUserId("1");
		GetUserResponse response = (GetUserResponse)webServiceTemplate.marshalSendAndReceive(request);
		String name = response.getUserDetails().getUserName();
		System.out.println(name);
		
		assertEquals("Puneet", name);
		
		
		
	}

}
