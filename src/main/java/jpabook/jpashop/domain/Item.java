package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Item 클래스
 *
 * @author hrjin
 * @version 1.0
 * @since 2019-07-07
 */
@Data
@Entity
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "item")
    private List<CategoryItem> categoryItems;
    private int price;
    private int stockQuantity;

}
