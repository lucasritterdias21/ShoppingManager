public class Alimentacao extends Loja{

    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int estoqueProdutos){
        super(nome, quantidadeFuncionarios,salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
        this.dataAlvara = dataAlvara;
   }



//acesso

public Data getDataAlvara(){
    return dataAlvara;
}

public void setDataAlvara(Data dataAlvara){
    this.dataAlvara = dataAlvara;
}

//toString
@Override
public String toString(){
    return super.toString() + "Data de alvará: " + dataAlvara;
}

}






