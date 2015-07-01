package pharmacy.controller;

import static java.util.Arrays.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pharmacy.adapter.PharmaciesAdapter;

@RestController
public class PharmacyEndpoint {

    private final PharmaciesAdapter pharmaciesAdapter;

    @Autowired
    public PharmacyEndpoint(PharmaciesAdapter pharmaciesAdapter) {
        this.pharmaciesAdapter = pharmaciesAdapter;
    }

    @RequestMapping(value = "pharmacy", method = RequestMethod.GET, produces = "application/json")
    public List<PharmacyJson> search() {
        return pharmaciesAdapter.search("Warszawa");
    }

    public static class PharmacyJson {
        public String name;

        public PharmacyJson(String name) {
            this.name = name;
        }
    }
}
