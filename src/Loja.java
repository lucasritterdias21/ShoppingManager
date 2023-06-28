public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;       
    private Produto[] estoqueProdutos;
    int tamanhoEstoque;



        //metodos construtores
        public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque){
            this.nome =nome;
            this.salarioBaseFuncionario = salarioBaseFuncionario;   
            this.quantidadeFuncionarios = quantidadeFuncionarios;
            this.endereco = endereco;
            this.dataFundacao = dataFundacao;   
            this.estoqueProdutos = new Produto[tamanhoEstoque];

        }
        
        public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamanhoEstoque){
            this.nome = nome;
            this.quantidadeFuncionarios = quantidadeFuncionarios;
            this.endereco = endereco;
            this.dataFundacao = dataFundacao;
            this.salarioBaseFuncionario = -1;
            this.estoqueProdutos = new Produto[tamanhoEstoque];
        }
    
        //metodos de acesso para cada atributo(variavel)
        public Produto[] getEstoqueProdutos(){
            return estoqueProdutos;
        }


        public Endereco getEndereco(){
            return endereco;
        }

        public void setEstoqueProdutos(Produto[] tamanhoEstoque){
            this.estoqueProdutos = tamanhoEstoque;
        }

        public Data getDataFundacao(){
            return dataFundacao;
        }

        public void setEndereco(Endereco endereco){
            this.endereco = endereco;
        }

        public void setDataFundacao(Data dataFundacao){
            this.dataFundacao = dataFundacao;
        }

        public String getNome(){
            return nome;
        }
    
        public int getQuantidadeFuncionarios(){
            return quantidadeFuncionarios;
        }
    
        public double getSalarioBaseFuncionario(){
            return salarioBaseFuncionario;
        }
    
        public void setNome(String nome){
            this.nome = nome;
        }
    
        public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
            this.quantidadeFuncionarios = quantidadeFuncionarios;
        }
    
        public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
            this.salarioBaseFuncionario = salarioBaseFuncionario;
        }

        //metodo que classifica o tamanho da loja de acordo com qtd funcionarios
        public char tamanhoDaLoja(){
            if (quantidadeFuncionarios < 10) {
                return 'P';
            }else if (quantidadeFuncionarios >=10 && quantidadeFuncionarios <= 30){
                return 'M';
            }else{
                return 'G';
            }
        }
    
        //metodo tostring
        @Override
        public String toString(){
            return "Nome da empresa: " + nome + " Quantidade funcionários da empresa: " + quantidadeFuncionarios + " Salário base do funcionário: " + salarioBaseFuncionario + "Data fundação:" + dataFundacao + "Endereço da loja:" + endereco;
            
        }
        //metodo que retorna gastos com salario da empresa
        public double gastosComSalario(){
            if (salarioBaseFuncionario != -1){
              return (salarioBaseFuncionario*quantidadeFuncionarios);  
            }else{
                return -1;
            }
        }
        
        //metodo imprimeProdutos
        public void imprimeProdutos() {
            System.out.println("Produtos da loja " + nome + ":");
            for (Produto produto : estoqueProdutos) {
                if (produto != null) {
                    System.out.println(produto);
                }
            }
        }
        //metodo insereProdutos
        public boolean insereProduto(Produto produto){
            for(int i = 0; i < estoqueProdutos.length; i++) {
                if (estoqueProdutos[i] == null) {
                    estoqueProdutos[i] = produto;
                    return true;
                }
            }
            return false;
        }

        //metodo removeProduto
        public boolean removeProduto(String nomeProduto){
            for (int i = 0; i < estoqueProdutos.length; i++) {
                Produto produto = estoqueProdutos[i];
                if (produto != null && produto.getNome().equals(nomeProduto)) {
                    estoqueProdutos[i] = null;
                    return true;
                }
            }
            return false;
        }
        



}       