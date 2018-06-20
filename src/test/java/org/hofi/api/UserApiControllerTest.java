package org.hofi.api;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.google.gson.Gson;
import org.hofi.model.HelloWorld;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(UserApiController.class)
public class UserApiControllerTest {

  private static final Logger log = LoggerFactory.getLogger(UserApiControllerTest.class);

  @Rule
  public WireMockRule wireMockRule = new WireMockRule(options().port(9090));

  @Autowired
  private MockMvc mvc;

  @Test
  public void addPet() throws Exception {
    Gson gson = new Gson();

    HelloWorld helloWorld = new HelloWorld();
    helloWorld.setMessage("HELLO WORLD");
    String json = gson.toJson(helloWorld);
    log.info("Json: " + json);

    this.mvc.perform(get("/user/login?username=user&password=123"))
          .andExpect(status().isOk())
          .andExpect(content().string(json));
  }
}