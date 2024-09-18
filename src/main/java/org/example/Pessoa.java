package org.example;

public class Pessoa {

    private String nome;
    private int idade;
    private float altura;
    private float salario;

    //Construtor de uma classe
    public Pessoa() {

        this.salario = 0;
    }

    //Metodos SET() com encapsulamento dos atributos
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public void setAltura(float altura)
    {
        this.altura = altura;

    }

    public void setSalario(float salario)
    {
        this.salario = salario;
    }

    //Metodos GET()
    public String getNome()
    {
        return nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public float getAltura()
    {
        return altura;
    }

    public float getSalario()
    {
        return salario;
    }


    //Sobrecarga de métodos
    public  float getRendimento(int Meses)
    {

        return salario*Meses;

    }

    public float getRendimento()
    {
        return salario;
    }


}
