public class Data{
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Utilizando a data padrão: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    private boolean validaData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            return false;
        }

        if (mes == 2) {
            if (dia > 29) {
                return false;
            } else if (dia == 29 && !verificaAnoBissexto()) {
                return false;
            }
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                return false;   
            }
        }

        return true;
    }
        
        public int getDia(){
            return dia;
        }
        
        public int getMes(){
            return mes;
        }
        
        public int getAno(){
            return ano;
        }
        
        public void setDia(int dia){
            this.dia = dia;
        }
        
        public void setMes(int mes){
            this.mes = mes;
        }
        
        public void setAno(int ano){
            this.ano = ano;
        }

        //metodo toString
        public String toString(){
            return dia + "/" +  mes + "/" + ano;
        }

        //metodo de verificação de ano bissexto
        public boolean verificaAnoBissexto(){
            if (ano % 4 == 0) {
                if (ano % 100 == 0) {
                    if (ano % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
        

}