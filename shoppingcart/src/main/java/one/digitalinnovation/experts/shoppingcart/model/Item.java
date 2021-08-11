package one.digitalinnovation.experts.shoppingcart.model;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Item")
public class Item implements Serializable {

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    private String productId;
    private String name;
    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
