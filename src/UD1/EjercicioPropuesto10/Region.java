package UD1.EjercicioPropuesto10;

public abstract class Region implements IFecha
{
    String region;

    public Region(String region) {
        this.region = region;
    }

    @Override
    public String Formatear(int dia, int mes, int año)
    {
        switch (region)
        {
            case "ISO":
                return año + "/" + mes + "/" +  dia;
            case "Inglesa":
                    return mes + "/" + dia + "/" + año;
            case "Española":
                return dia + "/" + mes + "/" + año;
        }
        return null;
    }
}
