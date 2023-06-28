public class Endereco{
    private String nomeDaRua;
    private String estado;
    private String cidade;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;
    
        public Endereco(String nomeDaRua, String estado, String cidade, String pais, String cep, String numero, String complemento){
            this.nomeDaRua = nomeDaRua;
            this.estado = estado;
            this.pais = pais;
            this.cep = cep;
            this.numero = numero;
            this.complemento = complemento;
            this.cidade = cidade;
            
        }
        
        //metodos de acesso
        public String getNomeDaRua(){
            return nomeDaRua;
        }
        
        public String getEstado(){
            return estado;
        }

        public String getCidade(){
            return cidade;
        }

        public void setCidade (String cidade){
            this.cidade = cidade;
        }
        
        public String getPais(){
            return pais;
        }
        
        public String getCep(){
            return cep;
        }
        
        public String getNumero(){
            return numero;
        }
        
        public String getComplemento(){
            return complemento;
        }
        
        public void setNomeDaRua(String nomeDaRua){
            this.nomeDaRua = nomeDaRua;
        }
        
        public void setEstado(String estado){
            this.estado = estado;
        }
        
        public void setPais(String pais){
            this.pais = pais;
        }
        
        public void setCep(String cep){
            this.cep = cep;
        }
        
        public void setNumero(String numero){
            this.numero = numero;
        }
        
        public void setComplemento(String complemento){
            this.complemento = complemento;
        }
        
        //metodo toString
            public String toString(){
                return "Rua " + nomeDaRua + ", " + numero + estado + pais + cep + complemento;
            }
        
}  