package co.com.duck.jpa.repository.customer.data;

import co.com.duck.jpa.repository.customerproduct.data.CustomerProductEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
@Builder(toBuilder = true)
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "customer_identification_number", length = 255)
    private String customerIdentificationNumber;

    @Column(name = "customer_type", length = 255)
    private String customerType;

    @Column(name = "status", length = 8)
    private String status;


    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "registration_number", length = 20)
    private String registrationNumber;

    @Column(name = "vat_number", length = 20)
    private String vatNumber;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<CustomerProductEntity> customerProducts;


}
