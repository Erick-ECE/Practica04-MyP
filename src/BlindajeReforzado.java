/**Clase concreta que especifica el tipo de elemento Blindaje
 * dando valores especificas a las cualidades del elemento
  */
public class BlindajeReforzado extends Blindaje{
    
    public BlindajeReforzado() {
        super.nombre ="Blindaje Reforzado";
        super.ataque = 0;
        super.costo = 200;
        super.defensa = 2;
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