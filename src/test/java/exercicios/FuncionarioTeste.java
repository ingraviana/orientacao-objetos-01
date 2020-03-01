package exercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FuncionarioTeste {

    @Test
    public void criarObjetoFuncionario(){
        Funcionarios f1 = new Funcionarios();
        assertNotNull(f1);
    }

    @Test
    public void presencaAtributoNome(){
        Funcionarios f1 = new Funcionarios();
        f1.nome = "July";
        assertNotNull(f1.nome);
    }

    @Test
    public void presencaAtributoEmail(){
        Funcionarios f1 = new Funcionarios();
        f1.email = "july@email.com";
        assertNotNull(f1.email);
    }

    @Test
    public void presencaAtributoIdade(){
        Funcionarios f1 = new Funcionarios();
        f1.idade = 22;
        assertNotNull(f1.idade);
    }

    @Test
    public void presencaAtributoSalario(){
        Funcionarios f1 = new Funcionarios();
        f1.salario = 3000.0;
        assertNotNull(f1.salario);
    }

    @Test
    public void metodoObterDados(){

        //Arrange
        Funcionarios f1 = new Funcionarios();
        f1.nome = "July";
        f1.idade = 22;
        f1.email = "july@email.com";
        String valorEsperado = "July, 22 anos (july@email.com)";
        //Act
        String valorObtido = f1.obterDados();
        //Assert
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoPromover(){

        //Arrange
        Funcionarios f1 = new Funcionarios();
        f1.salario = 3000.0;
        Double valorEsperado = 3300.0;
        f1.promover(10.0);

        //Act
        Double valorObtido = f1.salario;
        //Assert
        assertEquals(valorEsperado, valorObtido);
    }
}
