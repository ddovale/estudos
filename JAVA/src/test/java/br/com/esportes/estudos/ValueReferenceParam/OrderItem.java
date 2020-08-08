package br.com.esportes.estudos.ValueReferenceParam;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderItem {

    private Integer id;
    private String description;
    private Integer quantity;

}
