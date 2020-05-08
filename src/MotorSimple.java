/**Clase concreta que especifica el tipo de elemento Motor
 * dando valores especificas a las cualidades del elemento
  */
public class MotorSimple extends Motor {
    
    public MotorSimple() {
        super.nombre ="Motor Simple";
        super.ataque = 1;
        super.costo = 100;
        super.defensa = 2;
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