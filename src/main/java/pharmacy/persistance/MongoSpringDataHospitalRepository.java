package pharmacy.persistance;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoSpringDataHospitalRepository extends MongoRepository<Hospital, String>{
}
