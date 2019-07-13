package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author hrjin
 * @version 1.0
 * @since 2019-07-13
 */
@Data
@Entity
public class Delivery {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne(mappedBy = "delivery")
    private Order order;
    private String city;
    private String street;
    private String zipCode;
    private DeliveryStatus status;

}
