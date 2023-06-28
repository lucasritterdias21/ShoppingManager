public class Informatica extends Loja {

    public double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, tamanhoEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }
    


    
//acesso

public double getSeguroEletronicos(){
    return seguroEletronicos;
}

public void setSeguroEletronicos(double seguroEletronicos){
    this.seguroEletronicos = seguroEletronicos;
}

//sobrescrita toString
public String toString(){
    return super.toString() + "Seguro eletrônicos: " + seguroEletronicos;
}

}
