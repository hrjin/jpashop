package jpabook.jpashop.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * 임베디드 객체 타입 Address 클래스
 * 불변 객체를 위해 Setter 는 만들지 않음.
 *
 * @author hrjin
 * @version 1.0
 * @since 2019-07-21
 */
@Getter
@EqualsAndHashCode
@Embeddable
public class Address {
    @Column(length = 10)
    private String city;

    @Column(length = 20)
    private String street;

    @Column(length = 5)
    private String zipCode;

    public String fullAddress(){
        return getZipCode() + " " + getCity() + " " + getStreet() ;
    }
}
