package aerolinea;

public class Aerolinea {

    public String reservaVuelo(String destino, int numeroPasajes, int dia, int mes, int gestion) {
        if (existenPasajes(destino, numeroPasajes)) {
            String diaSemana = getDay(dia, mes, gestion);
            String mesString = getMesString(mes);
            return "El dia " + diaSemana + " " + dia + " " + mesString + " " + gestion + " existen "
                    + numeroPasajes + " pasajes para " + destino;
        } else {
            return "No existen suficientes pasajes para " + destino;
        }
    }

    private boolean existenPasajes(String destino, int cantidad) {
        return destino.equals("La Paz") && cantidad <= 2;
    }

    // Método que obtiene el día de la semana a partir de la fecha
    private String getDay(int dia, int mes, int gestion) {
        // Lógica para obtener el día de la semana
        // Simulación para el ejemplo
        return "Lunes";
    }

    private String getMesString(int mes) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return meses[mes - 1];
    }

}