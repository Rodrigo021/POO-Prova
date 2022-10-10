package Questão_1;

import java.util.ArrayList;

public class Carrinho {
    public static void main(String[] args) {
        Compra compra = new Compra();
        ArrayList<Item> i1 = new ArrayList<>();

        i1.add(new Item("macarrão parafuso", 5));
        i1.add(new Item("macarrão espaguete", 4));

        compra.add_Produto(new Produto("massas", i1));

        ArrayList<Item> i2 = new ArrayList<>();

        i2.add(new Item("coca cola", 10));
        i2.add(new Item("fanta laranja", 6));

        compra.add_Produto(new Produto("refrigerante", i2));

        compra.lista_Produtos();
    }
}
