package exercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class CirculoTeste {

    @Test
    public void criarObjetoCirculo(){
        Circulo c1 = new Circulo();
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributos(){
        Circulo c1 = new Circulo();
        c1.pi = 3.0;
        c1.raio = 2.0;
        assertNotNull(c1.pi);
        assertNotNull(c1.raio);
    }

    @Test
    public void metodoCalcularArea(){

        //Arrange
        Circulo c1 = new Circulo();
        c1.pi = 3.0;
        c1.raio = 2.0;
        Double valorEsperado = 12.0;
        //Act
        Double valorObtido = c1.calcularArea();
        //Assert
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro(){

        //Arrange
        Circulo c1 = new Circulo();
        c1.pi = 3.0;
        c1.raio = 2.0;
        Double valorEsperado = 12.0;
        //Act
        Double valorObtido = c1.calcularPerimetro();
        //Assert
        assertEquals(valorEsperado, valorObtido);
    }
}

