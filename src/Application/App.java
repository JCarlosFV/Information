package Application;

import Utils.Information;

public class App {
    public static void main(String[] args) {

        System.out.println("Nombre Empresa: " + Information.Nombre_Empresa + "\n");

        System.out.println("Direccion: " + Information.Direccion_Empresa + "\n");

        System.out.println("Seguro Social: " + Information.Impuesto_SeguroSocial + "\n");

        Information.Dias_laborales();

        System.out.println("Horario: " + Information.Horario + "\n");

        System.out.println("Pago por Hora Extra: "+Information.Pago_HoraExtra + "\n");

        Information.Feriados();

        Information.Vacaciones_Anuales();



    }
}