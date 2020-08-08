package br.com.esportes.estudos.ValueReferenceParam;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ValueReferenceParamTests {

    @Test
    void objectChecks() {

        System.out.println("----- Primeiro Objeto -----");
        OrderItem orderItem = new OrderItem(1, "camiseta", 2);
        Order order = new Order("123456", 25.75, orderItem);
        System.out.println("OrderNumber: " + order.getOrderNumber());
        System.out.println("Price: " + order.getPrice());
        System.out.println("OrderItem: " + order.getOrderItem());
        System.out.println("Order hashcode: " + System.identityHashCode(order));
        System.out.println("OrderItem hashcode: " + System.identityHashCode(order.getOrderItem()));
        System.out.println("---------------------------");


        System.out.println("----- Segundo Objeto ------");
        OrderItem orderItem2 = new OrderItem(1, "camiseta", 2);
        Order order2 = new Order("123456", 25.75, orderItem2);
        System.out.println("OrderNumber: " + order2.getOrderNumber());
        System.out.println("Price: " + order2.getPrice());
        System.out.println("OrderItem: " + order2.getOrderItem());
        System.out.println("Order hashcode: " + System.identityHashCode(order2));
        System.out.println("OrderItem hashcode: " + System.identityHashCode(order2.getOrderItem()));
        System.out.println("---------------------------");
    }

    @Test
    void changingObject() {
        OrderItem orderItem = new OrderItem(1, "camiseta", 2);
        Order order = new Order("123456", 25.75, orderItem);
        System.out.println("Meu objeto principal é o " + System.identityHashCode(order));
        System.out.println("Agora, vou passá-lo para algum método e ver o que acontece.");
        changingObjectChecks(order);
        System.out.println("Voltando ao main, percebo que meu objeto principal ainda é " + System.identityHashCode(order));

        System.out.println("---");
        System.out.println("Tudo bem, agora sei que alterar a instancia do meu objeto em outro método não afeta o objeto original.");
        System.out.println("Mas e se eu alterar algo dentro deste objeto? Vamos ver: ");

        System.out.println("");
        System.out.println("O orderNumber original do meu objeto é " + order.getOrderNumber());
        changingObjectChecks2(order);
        System.out.println("Voltando ao main, meu order number agora é " + order.getOrderNumber());

        System.out.println("");
        System.out.println("As variáveis trafegadas foram cópias dos valores das variáveis originais.");
        System.out.println("Como um objeto é um tipo complexo e, portanto, armazena uma REFERÊNCIA a algum objeto em memória, o que é copiado é o valor da referência.");
        System.out.println("Logo, ambos tem referências que apontam para o mesmo objeto, apesar de serem variáveis diferentes.");
        System.out.println("");
    }

    private void changingObjectChecks(Order order) {
        System.out.println("Fora do main, estou recebendo o objeto " + System.identityHashCode(order));
        System.out.println("");
        System.out.println("Agora, ainda fora do main, vou instaciar meu objeto novamente e checá-lo");

        OrderItem orderItem2 = new OrderItem(1, "camiseta", 2);
        Order order2 = new Order("123456", 25.75, orderItem2);
        System.out.println("Meu novo objeto é " + System.identityHashCode(order2));
        System.out.println("");
    }

    private void changingObjectChecks2(Order order){
        System.out.println("Fora do main, recebi um objeto com order number " + order.getOrderNumber());
        System.out.println("Agora, ainda fora do main, vou alterar o order number para ser igual a 56789");
        order.setOrderNumber("56789");
        System.out.println("Então, meu order number fora do main agora é " + order.getOrderNumber());
    }
}