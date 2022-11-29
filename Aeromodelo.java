public class Aeromodelo {
  
    private int id;
    private String marca;
    private String modelo;
    
    public Aeromodelo(int id, String marca, String modelo) {
  
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    public double getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }
    


    public void setMarca(String marca) {
        this.marca = marca;
    }


}