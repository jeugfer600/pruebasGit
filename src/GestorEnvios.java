public class GestorEnvios {
    public double calcular(double precio){
        double envio = 0.0;
        if (precio < 0) throw new IllegalArgumentException("precio negativo");
        if (precio < 20) envio = 5.0;
        if(precio >= 20 && precio <= 49) envio = 3.0;
        return envio;
    }
}
