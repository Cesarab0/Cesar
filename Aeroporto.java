import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Aeroporto {
    public static void main(String[] args) throws Exception {
        int op;
        Scanner scanner = new Scanner(System.in);

        do{ 
        System.out.println("");
        System.out.println("Escolha a Opção: ");
        System.out.println("1 - Cadastrar Companhia");
        System.out.println("2 - Listar Companhia");
        System.out.println("3 - Cadastrar Avião");
        System.out.println("4 - Listar Aviões");

        op = scanner.nextInt();
        switch (op) {
            case 1:
            try {
        
                System.out.println("Digite o nome da empresa: ");
                String nome = scanner.next();
                System.out.println("Digite o CNPJ da empresa: ");
                String cnpj = scanner.next();
                
                
                new Companhia(nome,cnpj);
            } catch (Exception e) {
                System.out.println("Erro ao cadastrar companhia. " + e.getMessage());
            }
                break;
            
            case 2 :
                try {
                    Connection conexao = DAO.createConnection();;
                    String query = "select ID_COMPANHIA,NOME,CNPJ from COMPANHIA;";
                    PreparedStatement stmt = conexao.prepareStatement(query);
			        ResultSet rs = stmt.executeQuery(query);
                    System.out.println("ID -- NOME  --  CNPJ" + "\n" +
                                       "--------------------");
			        while (rs.next()) {
                    String id = rs.getString(1);
                    String nome = rs.getString(2);
				    String cnpj = rs.getString(3);
				  
				    
				    System.out.print(id+ " | " + nome + " | ");
				    System.out.println(cnpj);
				     
			}
            DAO.closeConnection();
			rs.close();
                 
                } catch (Exception e) {
                    System.out.println("Erro ao listar companhia. " + e.getMessage());
                }
                    break;
                case 3:
                    try {
                
                        System.out.println("Digite o nome da empresa: ");
                        String nome = scanner.next();
                        System.out.println("Digite o CNPJ da empresa: ");
                        String cnpj = scanner.next();
                        
                        
                        new Companhia(nome,cnpj);
                    } catch (Exception e) {
                        System.out.println("Erro ao cadastrar companhia. " + e.getMessage());
                    }
                        break;
        
            default:
                break;
        }
        } while(op != 9);
            
          



        }
                
       
}
