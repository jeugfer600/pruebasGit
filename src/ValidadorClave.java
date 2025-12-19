public class ValidadorClave {
    public boolean esValida(String clave){
        if(clave == null || clave.length() < 8 || !(clave.matches(".*\\d.*"))){
            return false;
        }
        return true;
    }
}
