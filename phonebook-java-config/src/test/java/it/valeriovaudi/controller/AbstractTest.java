package it.valeriovaudi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.valeriovaudi.config.PhonBookApplicationContext;
import it.valeriovaudi.config.web.PhoneBookMvcContext;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * Created by Valerio on 26/07/2014.
 */
@WebAppConfiguration
@ContextConfiguration(classes = {PhonBookApplicationContext.class, PhoneBookMvcContext.class})
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class AbstractTest {

    protected static Logger logger = Logger.getLogger(ContactRestServiceTest.class);

    @Autowired
    protected WebApplicationContext wac;
    protected MockMvc mockMvc;

    protected ObjectMapper objectMapper;

    @Before
    public void before() {
        objectMapper =  new ObjectMapper();
        this.mockMvc = webAppContextSetup(this.wac).build();
    }

}
