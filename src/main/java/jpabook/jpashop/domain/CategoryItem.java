package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * CategoryItem 클래스
 *
 * @author hrjin
 * @version 1.0
 * @since 2019-07-13
 */
@Data
@Entity
public class CategoryItem {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
}
