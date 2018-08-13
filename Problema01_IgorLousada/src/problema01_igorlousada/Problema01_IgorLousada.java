package problema01_igorlousada;

public class Problema01_IgorLousada{
    
    public static void main (String args[]){
           
	Nome n = new Nome();
	Leitura l = new Leitura();
        CadPes cad = new CadPes();
        
        int op = 0, cont=0;
                    
        while(true){
            System.out.println("\n1 - Cadastrar pessoa");
            System.out.println("\n2 - Listar pessoas");
            System.out.println("\n3 - Sair");
               
            try{
                op = Integer.parseInt(l.entra(("\nEscolha uma opção: ")));
            }
            catch(NumberFormatException a){
                System.out.println("\nInsira um número!\n");
            }
            
            switch(op){
                case 1:
                    n = new Nome();
                    System.out.println("Cadastro de Pessoa");
                    n.setNome(l.entra("\nInsira um nome:"));
                    cad.setListPes(n);
                    cont++;
                break;

                case 2:
                    n = new Nome();
                    
                    System.out.println("\nLista de pessoas");
                    for(int cont2 = 0; cont2 < cont; cont2++){
                        n = cad.consPes(n,cont2);
                        System.out.println("\nNOME: "+n.getNome());
                    }
                break;

                case 3:
                    System.exit(0);
                break;

                default:
                    System.out.println("Inválido: "+op);
                break;
            }
        }
    }
}