package pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pharmacy.persistance.PharmacyRepository;

@RestController
public class PharmacyEndpoint {

    @Autowired
    PharmacyRepository repository;

    @RequestMapping(value = "pharmacies", method = RequestMethod.GET, produces = "application/json")
    public PharmaciesJson search() {
       return repository.get();
    }

    @Document(collection = "pharmacy")
    public static class PharmaciesJson {
        @Id
        public String id;
        public Result result;
    }

    public static class Result {
        public List<String> featureMemberPropertyKey;
        public List<Member> featureMemberList;
    }

    public static class Member {
        public Geometry geometry;
        public List<Property>properties;
    }

    public static class Geometry {
        public String type;
        public List<Coordinate> coordinates;
    }

    public static class Coordinate {
        public String latitude;
        public String longitude;
    }

    public static class Property {
        public String value;
        public String key;
    }
}


