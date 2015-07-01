package pharmacy.controller;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jayway.restassured.RestAssured;

import pharmacy.DemoApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebIntegrationTest({"server.port=0"})
@ActiveProfiles("mongo")
public class HospitalEndpointIntegrationTest {

    @Value("${local.server.port}")
    int port;

    @Before
    public void setUp() throws Exception {
        RestAssured.port = port;
    }

    @Test
    public void name() {

        when()
                .get("hospital")
        .then()
                .statusCode(200).log().body()
                .body("name", hasItems("Centrum Medyczne \"Żelazna\""));

    }

}