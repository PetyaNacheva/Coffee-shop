package bg.coffeshop.coffeeShop.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

    private String id;

    protected BaseEntity() {
    }

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}