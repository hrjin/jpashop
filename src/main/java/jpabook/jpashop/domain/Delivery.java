package jpabook.jpashop.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

/**
 * @author hrjin
 * @version 1.0
 * @since 2019-07-13
 */
@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class Delivery extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;

    private String city;
    private String street;
    private String zipCode;
    private DeliveryStatus status;

}
