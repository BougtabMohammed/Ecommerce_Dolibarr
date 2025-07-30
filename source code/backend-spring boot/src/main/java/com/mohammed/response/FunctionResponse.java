package com.mohammed.response;

import com.mohammed.dto.OrderHistory;
import com.mohammed.model.Cart;
import com.mohammed.model.Product;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionResponse {
    private String functionName;
    private Cart userCart;
    private OrderHistory orderHistory;
    private Product product;
}
