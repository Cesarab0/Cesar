public class Hangar {
  
    private int id;
    private String local;

    
    public Hangar(int id, String local, int) {
  
        this.id = id;
        this.local = local;
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

    public String getLocal() {
        return this.local;
    }
    


    public void setLocal(String local) {
        this.local = local;
    }


}