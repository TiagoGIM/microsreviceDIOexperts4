package one.digitalinnovation.experts.productcatalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

//@Document(indexName = "product",createIndex = true,type="catalog")
@Document(indexName = "product",createIndex = true)
public class Product {

    @Id
    private Long id;

    @Field(type = FieldType.Text)
    private String name;

    @Field(type = FieldType.Integer)
    private Integer amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
