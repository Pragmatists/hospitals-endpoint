package pharmacy.persistance;

import static java.util.Arrays.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import pharmacy.controller.HospitalEndpoint;
@Component
@Profile("dev")
public class TransientHospitalRepository implements HospitalRepository {

    @Override
    public List<HospitalEndpoint.HospitalJson> list() {
        return new ArrayList<>(asList(new HospitalEndpoint.HospitalJson("1", "Centrum Medyczne \"Żelazna\"","ŻELAZNA 90, 01-004 " +
                "Warszawa","0225369302",
                "http://www.szpitalzelazna.pl", "Izba Przyjęć")));
    }
}
