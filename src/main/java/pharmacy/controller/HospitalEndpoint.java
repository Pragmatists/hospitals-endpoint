package pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pharmacy.persistance.HospitalRepository;

@RestController
public class HospitalEndpoint {

    @Autowired
    HospitalRepository repository;

    @RequestMapping(value = "hospital", method = RequestMethod.GET, produces = "application/json")
    public List<HospitalJson> search() {
       return repository.list();
    }

    public static class HospitalJson {
        public String name;
        public String address;
        public String phone;
        public String www;
        public String type;

        public HospitalJson(String name, String address, String phone, String www, String type) {
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.www = www;
            this.type = type;
        }

    }
}


