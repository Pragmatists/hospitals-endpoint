package pharmacy.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;

import pharmacy.controller.PharmacyEndpoint;

public interface MongoSpringDataPharmacyRepository extends MongoRepository<PharmacyEndpoint.PharmaciesJson, String> {
}
