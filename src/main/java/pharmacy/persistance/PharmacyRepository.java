package pharmacy.persistance;

import java.util.List;

import pharmacy.controller.PharmacyEndpoint;

public interface PharmacyRepository {
    PharmacyEndpoint.PharmaciesJson get();
}
