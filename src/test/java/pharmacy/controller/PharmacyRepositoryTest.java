package pharmacy.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jayway.restassured.RestAssured;

import pharmacy.DemoApplication;
import pharmacy.persistance.PharmacyRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@ActiveProfiles("mongo")
public class PharmacyRepositoryTest {


    @Autowired
    PharmacyRepository pharmacyRepository;

    @Test
    public void get_pharmacies() {

        PharmacyEndpoint.PharmaciesJson pharmaciesJson = pharmacyRepository.get();
        assertThat(pharmaciesJson).isNotNull();

    }

}