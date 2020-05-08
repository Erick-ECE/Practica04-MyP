/**Clase concreta que especifica el tipo de elemento Motor
 * dando valores especificas a las cualidades del elemento
  */
public class MotorDeportivo extends Motor{
    
    public MotorDeportivo() {
        super.nombre ="Motor Deportivo";
        super.ataque = 2;
        super.costo = 200;
        super.defensa = 1;
        super.velocidad = 2;
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