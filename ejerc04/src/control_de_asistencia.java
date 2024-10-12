public class control_de_asistencia {
    String Estudiante;
    int diasAsistidos;

    public String getEstudiante() {
        return Estudiante;
    }

    public void setEstudiante(String estudiante) {
        Estudiante = estudiante;
    }

    public int getDiasAsistidos() {
        return diasAsistidos;
    }

    public void setDiasAsistidos(int diasAsistidos) {
        this.diasAsistidos = diasAsistidos;
    }

    //metodos
    public double Porcentaje(){
        return (this.diasAsistidos*100)/30;
    }
    public String estadoestudiante(){
        double Asistio = this.Porcentaje();5
        if(Asistio<50){
            return ("Reprobado");
        } else if (Asistio>=50 && Asistio<=75) {
            return ("Condicinal");
        }else{
            return ("Aprobado");
        }
    }

}

