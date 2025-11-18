package model.entity;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Customer {

    private String id;
    private String title;
    private String name;
    private String dob;
    private Double salary;
    private String city;
    private String province;
    private String postalCode;

}
