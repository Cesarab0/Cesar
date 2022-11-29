public class Aviao {
    

    private int id;
    private int prefixo;
    private int capacidade;
    Companhia companhia;
    private int id_companhia;

    public Aviao(int id, int capacidade,int prefixo, int id_companhia) {
  
        this.id = id;
        this.capacidade = capacidade;
        this.prefixo = prefixo;
        this.id_companhia = companhia.getId();

  
    PreparedStatement stmt = DAO.createConnection().prepareStatement(
           "INSERT INTO AVIAO (prefixo, capacidade, ID_COMPANHIA) VALUES (?, ?, ?);"
        );
        stmt.setString(1, this.getPrefixo());
        stmt.setString(2, this.getCapacidade());
        stmt.setString(3, this.companhia.getId());
        stmt.execute();
        DAO.closeConnection();

    }

    public double getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrefixo() {
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
            " Prefixo =" + getPrefixo() + "\n" + 
            " Capacidade =" + getCapacidade()+ "\n" +
            " ID Companhia =" + companhia.getId()+ "\n";
    }


}
