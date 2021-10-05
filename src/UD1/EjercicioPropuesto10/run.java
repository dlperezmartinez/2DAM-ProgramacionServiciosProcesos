package UD1.EjercicioPropuesto10;

public class run
{
    public static void main(String[] args) {
        Region iso = new RegionISO("ISO");
        Region inglesa = new RegionInglesa("Inglesa");
        Region española = new RegionEspañola("Española");

        System.out.println("Fecha ISO: " + iso.Formatear(27, 9, 2021));
        System.out.println("Fecha Inglesa: " + inglesa.Formatear(27, 9, 2021));
        System.out.println("Fecha Española: " + española.Formatear(27, 9, 2021));
    }
}
