import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Aviao {
    

    private int id;
    private String modelo;
    private String marca;
    private int prefixo;
    private int capacidade;
    Companhia companhia;
    private int id_companhia;

    public Aviao(int id,String modelo,String marca, int capacidade,int prefixo, int id_companhia) throws SQLException {
  
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.capacidade = capacidade;
        this.prefixo = prefixo;
        this.id_companhia = companhia.getId();

        try{
            Connection conexao = DAO.createConnection();;
            PreparedStatement stmt = conexao.prepareStatement(
                "INSERT INTO AVIÃO (NOME, CNPJ) VALUES (?, ?);"
             );
             stmt.setString(1, this.getModelo());
             stmt.setString(2, this.getMarca());
             stmt.setInt(3, this.getPrefixo());
             stmt.setInt(4, this.getCapacidade());
             stmt.setInt(5, this.companhia.getId());
             stmt.execute();
             DAO.closeConnection();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }

  
    PreparedStatement stmt = DAO.createConnection().prepareStatement(
           "INSERT INTO AVIAO (MARCA,MODELO,PREFIXO, CAPACIDADE, ID_COMPANHIA) VALUES (?, ?, ?, ? , ?);"
        );
        stmt.setString(1, this.getMarca());
        stmt.setString(2, this.getModelo());
        stmt.setInt(3, this.getId());
        stmt.setInt(4, this.getPrefixo());
        stmt.setInt(5, this.getCapacidade());
        stmt.execute();
        DAO.closeConnection();

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrefixo() {
        return this.prefixo;
    }

    public void setPrefixo(int id) {
        this.prefixo = prefixo;
    }
    

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }


    @Override
    public String toString() {
        return 
            " Id =" + getId() + "\n" +
            " Modelo =" + getPrefixo() + "\n" + 
            " Marca =" + getPrefixo() + "\n" + 
            " Prefixo =" + getPrefixo() + "\n" + 
            " Capacidade =" + getCapacidade()+ "\n" +
            " ID Companhia =" + companhia.getId()+ "\n";
    }


}
