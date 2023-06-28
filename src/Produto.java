public class Produto{
    private String nome;
    private double preco;
    public Data dataValidade;

    
        public Produto(String nome, double preco, Data dataValidade){
            this.nome = nome;
            this.preco = preco;
            this.dataValidade = dataValidade;

        }
        
        public Data getDataValidade(){
            return dataValidade;
        }

       public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
       } 


        public String getNome(){
            return nome;    
        }
    
        public double getPreco(){
            return preco;
        }
    
        public void setNome(String nome){
            this.nome = nome;
        }
    
        public void setPreco(double preco){
            this.preco = preco;
        }
    
        //toString
        public String toString(){
            return "Nome do produto: " + nome + "Preço: " + preco + "Validade:" + dataValidade;
        }
            
    
        
        //metodo estaVencido
        public boolean estaVencido(Data Data){
            if(Data.getAno()<dataValidade.getAno()){
                return true;
            }else if (Data.getAno() == dataValidade.getAno()){
                if (Data.getMes() > dataValidade.getMes())
                    return false;
                else    
                    return true;
            }
            return false;
        } 
       
    
}
  

    
                          
    