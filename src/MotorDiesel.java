/**Clase concreta que especifica el tipo de elemento Motor
 * dando valores especificas a las cualidades del elemento
  */
public class MotorDiesel extends Motor{
    
    public MotorDiesel() {
        super.nombre ="Motor Diesel";
        super.ataque = 3;
        super.costo = 300;
        super.defensa = 3;
        super.velocidad = 1;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getCosto() {
        return costo;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }
}