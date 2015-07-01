package pharmacy.adapter;

import static java.util.Arrays.*;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import pharmacy.controller.PharmacyEndpoint;

@Service
public class PharmaciesAdapter {

    public ArrayList<PharmacyEndpoint.PharmacyJson> search(String queryString) {
        return new ArrayList<>(asList(new PharmacyEndpoint.PharmacyJson("Apteka_1"), new PharmacyEndpoint.PharmacyJson("Apteka_2")));
    }
}
