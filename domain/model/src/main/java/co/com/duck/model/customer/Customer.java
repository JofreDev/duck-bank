package co.com.duck.model.customer;
import lombok.*;
//import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@ToString
public class Customer {

    private String identificationNumber;

    private String type;

    private String status;

    private String name;

    private String email;
}
