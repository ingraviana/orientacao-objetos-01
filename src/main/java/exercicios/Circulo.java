package exercicios;

public class Circulo {
    public Double pi;
    public Double raio;

    public Double calcularArea(){

        return pi * (raio * raio);
    }

    public Double calcularPerimetro(){

        return  2 * pi * raio;
    }
}
