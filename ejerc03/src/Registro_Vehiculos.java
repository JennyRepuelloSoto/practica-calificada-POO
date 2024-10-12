import java.time.LocalDate;

public class Registro_Vehiculos {
    String marca;
    String Modelo;
    int anioFab;
    Double velocidadAct;
    int anioAct= LocalDate.now().getYear();

    public int getAnioAct() {
        return anioAct;
    }

    public void setAnioAct(int anioAct) {
        this.anioAct = anioAct;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(int anioFab) {
        this.anioFab = anioFab;
    }

    public Double getVelocidadAct() {
        return velocidadAct;
    }

    public void setVelocidadAct(Double velocidadAct) {
        this.velocidadAct = velocidadAct;
    }


    //metodos

    public int  edadVehicular(){
        return (this.anioAct- this.anioFab);
    }

    public String EstadoVehicular(){
        int edadVehiculo = this.edadVehicular();
        if(edadVehiculo > 10){
            return "Antiguo";
        }else if(edadVehiculo >= 3 && edadVehiculo <= 10){
            return ("Semi-nuevo");
        }else{
            return ("Nuevo");
        }
    }
    public String Acelerar(){
        return "Acelerando";
    }
    public String Frenar(){
        return "Frenando";
    }

}

