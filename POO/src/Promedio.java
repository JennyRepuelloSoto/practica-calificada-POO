public class Promedio {

    // defino propiedades

    String nombre;
    int nota1;
    int nota2;
    int nota3;
    int nota4;

    // retorna  valor de varible nombre
    public String getNombre() {
        return nombre;
    }

    //asigna valor a variable nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    ///////////METODOS
    public int  promedioFinal(){
        return (this.nota1+this.nota2+this.nota3+this.nota4)/4;
    }


    public String condicionFinal(){
        int promedio = this.promedioFinal();
        if(promedio >= 10 && promedio <= 12 ){
            return "RECUPERACION";
        }else if(promedio >= 13){
            return "APROBADO";
        }else{
            return "DESAPROBADO";
        }

    }
}