package br.com.esportes.estudos.ValueReferenceParam;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {

    private String orderNumber;
    private Double price;
    private OrderItem orderItem;
}
