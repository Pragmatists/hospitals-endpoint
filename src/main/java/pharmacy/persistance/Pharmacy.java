package pharmacy.persistance;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pharmacy")
public class Pharmacy {
    @Id
    public String id;

    public String name;
    public String address;
    public String phone;
    public String www;
    public String type;

}
