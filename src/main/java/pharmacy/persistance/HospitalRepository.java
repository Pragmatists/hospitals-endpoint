package pharmacy.persistance;

import java.util.List;

import pharmacy.controller.HospitalEndpoint;

public interface HospitalRepository {
    List<HospitalEndpoint.HospitalJson> list();
}
