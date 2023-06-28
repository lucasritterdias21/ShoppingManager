public class Bijuteria extends Loja{

    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque, double metaVendas){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, tamanhoEstoque);
        this.metaVendas = metaVendas;
   }


//acesso


public double getMetaVendas(){
    return metaVendas;
}


public void setMetaVendas(double metaVendas){
    this.metaVendas = metaVendas;
}


//toString

@Override
public String toString(){
    return  "Meta de vendas da loja:" + metaVendas;
}

}

    

