package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Member 클래스
 *
 * @author hrjin
 * @version 1.0
 * @since 2019-07-07
 */
@Data
@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "member")
    private List<MemberProduct> memberProducts;

    private String city;
    private String street;
    private String zipCode;

}
