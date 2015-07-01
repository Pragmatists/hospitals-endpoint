package pharmacy.persistance;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import pharmacy.controller.HospitalEndpoint;

@Component
@Profile("mongo")
public class MongoHospitalRepository implements HospitalRepository {

    @Autowired
    MongoSpringDataHospitalRepository mongoSpringDataHospitalRepository;

    @Override
    public List<HospitalEndpoint.HospitalJson> list() {
        List<Hospital> hospitals = mongoSpringDataHospitalRepository.findAll();
        return hospitals.stream()
                .map(hospital -> new HospitalEndpoint.HospitalJson(
                        hospital.name,
                        hospital.address,
                        hospital.phone,
                        hospital.www,
                        hospital.type)).collect(toList());
    }
}
