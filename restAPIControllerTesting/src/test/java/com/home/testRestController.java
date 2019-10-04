package com.home;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.home.controllers.calculatorController;


@RunWith(SpringRunner.class)
@WebMvcTest(calculatorController.class)
public class testRestController {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void testController() throws Exception {
	RequestBuilder request= MockMvcRequestBuilders.get("/calculator/").accept(MediaType.APPLICATION_JSON);
	
    MvcResult result=mockMvc.perform(request).andReturn();
	String rest =result.getResponse().getContentAsString();
	
   assertTrue("Hello World".equals(rest));
	
	}

}
