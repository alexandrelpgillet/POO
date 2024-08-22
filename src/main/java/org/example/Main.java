package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {



        Automovel auto1 = new Automovel();

        Automovel auto2 = new Automovel();


        //ATRIBUTOS DO OBJETO AUTO1

        auto1.marca="Chevrolet";

        auto1.modelo="Onix";

        auto1.ano=2024;

        auto1.cor="Preto";

        auto1.potencia="1000cv";

        auto1.portas=4;

        auto1.placa="ACASD-13";


        //ATRIBUTOS  DO OBJETO AUTO2

        auto2.marca="Fiat";

        auto2.modelo="MOBI";

        auto2.ano=2018;

        auto2.cor="Vermelho";

        auto2.potencia="800cv";

        auto2.portas=4;

        auto2.placa="1DA1-13";


        System.out.println("MARCA="+auto1.marca);
        System.out.println("MODELO="+auto1.modelo);
        System.out.println("ANO ="+auto1.ano);
        System.out.println("COR="+auto1.cor);
        System.out.println("POTENCIA="+auto1.potencia);
        System.out.println("PORTAS="+auto1.portas);
        System.out.println("PLACA ="+auto1.placa);


        System.out.print("\n\n\n");


        System.out.println("MARCA="+auto2.marca);
        System.out.println("MODELO="+auto2.modelo);
        System.out.println("ANO ="+auto2.ano);
        System.out.println("COR="+auto2.cor);
        System.out.println("POTENCIA="+auto2.potencia);
        System.out.println("PORTAS="+auto2.portas);
        System.out.println("PLACA ="+auto2.placa);






    }

}