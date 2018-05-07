package core.persistence;

import lombok.Data;
import springfox.documentation.spi.DocumentationType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String phone;

    public Customer() {
    }

    public Customer(Long id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Customer(DocumentationType swagger2) {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
