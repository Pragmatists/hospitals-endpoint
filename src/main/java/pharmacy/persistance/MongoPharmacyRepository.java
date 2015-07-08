package pharmacy.persistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import pharmacy.controller.PharmacyEndpoint;

@Component
@Profile("mongo")
public class MongoPharmacyRepository implements PharmacyRepository {

    @Autowired
    MongoSpringDataPharmacyRepository mongoSpringDataPharmacyRepository;

    @Override
    public PharmacyEndpoint.PharmaciesJson get() {
        PharmacyEndpoint.PharmaciesJson pharmacy = mongoSpringDataPharmacyRepository.findAll().get(0);
        return pharmacy;
    }
}
