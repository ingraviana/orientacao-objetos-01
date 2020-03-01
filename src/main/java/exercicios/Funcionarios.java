package exercicios;

public class Funcionarios {
    public String nome;
    public String email;
    public Integer idade;
    public Double salario;

    public String obterDados(){
        return nome + ", " + idade + " anos " + "(" + email + ")";
    }

    public void promover(Double porcentagemAumento){
        salario = salario + (salario *+ porcentagemAumento/100.0);
    }
}
