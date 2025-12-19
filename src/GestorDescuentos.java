public class GestorDescuentos {

    public double calcular(double precio, int edad, int cant) {
        double desc = 0.0;

        if (precio < 0) throw new IllegalArgumentException("El precio no puede ser negativo");

        if (edad < 10) desc = 0.2;
        else if (edad >= 65) desc = 0.5;

        if (cant > 5) desc += 0.1; // ¡BUG!

        return precio * cant * (1 - desc);
    }
}