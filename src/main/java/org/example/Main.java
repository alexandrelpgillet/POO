package org.example;

public class Main{


    public static void main (String[] args)
    {

        Pessoa ins = new Pessoa();

        ins.setNome("Alexandre");
        ins.setAltura((float)1.8);
        ins.setIdade(21);

        //Metodos GET e SET
        System.out.println(ins.getNome());
        System.out.println(ins.getAltura());
        System.out.println(ins.getIdade());
        System.out.println(ins.getSalario());

        ins.setSalario(1000);


        //Sobrecarga de Metodos
        System.out.println(ins.getRendimento());
        System.out.println(ins.getRendimento(9));

    }


}