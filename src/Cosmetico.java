public class Cosmetico extends Loja{

    private double taxaComercializacao;

    
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque, double taxaComercializacao){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, tamanhoEstoque);
        this. taxaComercializacao = taxaComercializacao;
    }



    //acesso

    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }


    //toString
    @Override
    public String toString(){
        return super.toString() + "Taxa de comercialização: " + taxaComercializacao;
    }

}
