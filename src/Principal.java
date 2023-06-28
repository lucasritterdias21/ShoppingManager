import java.util.Scanner;

public class Principal{
    public Loja lojaMenu;
    public Produto produtoMenu;
    
    
    public Principal(Loja lojaMenu, Produto produtoMenu){
        this.lojaMenu = lojaMenu;
        this.produtoMenu = produtoMenu;
    }

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int opcao;
        String nomedaLoja;
        int quantidadeFuncionariosLoja;
        double salarioBase;
        int tamanhoEstoque;
        String ruaEndereco;
        String estadoEndereco;
        String cidadeEndereco;
        String paisEndereco;
        String cepEndereco;
        String numeroEndereco;
        String complementoEndereco;
        int diaDataFundacao;
        int mesDataFundacao;
        int anoDataFundacao;
        int diaValidade;
        int mesValidade;
        int anoValidade;
        String nomeDoProduto;
        double precoDoProduto;


    do{
        
        System.out.println("(1) criar uma loja");
        System.out.println("(2) criar um produto");
        System.out.println("(3) sair");
        
            //leitura do teclado
        System.out.println("Digite a opção desejada:");    
        opcao = ler.nextInt();        
        
        switch (opcao){
            case 1:
                //criacao objeto loja
    
                System.out.println("Digite o nome da loja:");
                nomedaLoja = ler.nextLine();

                System.out.println("Informe a quantidade de funcionários da loja:");
                quantidadeFuncionariosLoja = ler.nextInt();

                System.out.println("Digite o salário base dos funcionários:");
                salarioBase = ler.nextDouble();

                System.out.println("Endereço da loja: ");
                System.out.println("Digite o nome da rua: ");
                ruaEndereco = ler.nextLine();
                System.out.println("Digite o estado: ");
                estadoEndereco = ler.nextLine();
                System.out.println("Digite a cidade: ");
                cidadeEndereco = ler.nextLine();
                System.out.println("Digite o país: ");
                paisEndereco = ler.nextLine();
                System.out.println("Digite o cep: ");
                cepEndereco = ler.nextLine();
                System.out.println("Digite o número: ");
                numeroEndereco = ler.nextLine();
                System.out.println("Digite o complemento: ");
                complementoEndereco =  ler.nextLine();;
                Endereco enderecoLoja = new Endereco(ruaEndereco, estadoEndereco, cidadeEndereco, paisEndereco, cepEndereco, numeroEndereco, complementoEndereco);

                System.out.println("Digite a data de fncdação da loja: ");
                System.out.println("Digite a data de fundação da loja: ");
                System.out.println("Dia: ");
                diaDataFundacao = ler.nextInt();
                System.out.println("Mês: ");
                mesDataFundacao = ler.nextInt();
                System.out.println("Ano: ");
                anoDataFundacao = ler.nextInt();
                Data dataFundacaoDaLoja = new Data(diaDataFundacao, mesDataFundacao, anoDataFundacao);

                System.out.println("Digite o estoque da loja: ");
                tamanhoEstoque = ler.nextInt();


                Loja lojaPrincipal = new Loja(nomedaLoja, quantidadeFuncionariosLoja, salarioBase, enderecoLoja, dataFundacaoDaLoja, tamanhoEstoque);

                break;  
                
            case 2:
                //criacao objeto produto
                System.out.println("Digite o nome do produto: ");
                nomeDoProduto = ler.nextLine();
                System.out.println("Digite o preço do produto: ");
                precoDoProduto = ler.nextDouble();

                System.out.println("Digite a data de validade:");
                System.out.println("Dia: ");
                diaValidade = ler.nextInt();
                System.out.println("Mês: ");
                mesValidade = ler.nextInt();
                System.out.println("Ano: ");
                anoValidade = ler.nextInt();
                    Data dataValidadeProduto = new Data (diaValidade, mesValidade, anoValidade);
                    Produto produto = new Produto(nomeDoProduto, precoDoProduto, dataValidadeProduto);

                break;
                
            case 3:
                System.out.println("Saindo...");
            
                break;

            default:
                System.out.println("Opção Inválida!");
        }
        
    }while (opcao !=3);
    
    }
}
