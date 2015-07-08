package pharmacy.persistance;

import static java.util.Arrays.*;

import java.util.ArrayList;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import pharmacy.controller.PharmacyEndpoint;
@Component
@Profile("dev")
public class TransientPharmacyRepository implements PharmacyRepository {

    @Override
    public PharmacyEndpoint.PharmaciesJson get() {
        return new PharmacyEndpoint.PharmaciesJson();
    }
}
