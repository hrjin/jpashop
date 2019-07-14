package jpabook.jpashop.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

/**
 * Album 클래스
 *
 * @author hrjin
 * @version 1.0
 * @since 2019-07-14
 */
@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class Album extends Item {
    private String artist;
    private String etc;
}
