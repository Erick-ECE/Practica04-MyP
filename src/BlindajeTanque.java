/**Clase concreta que especifica el tipo de elemento Blindaje
 * dando valores especificas a las cualidades del elemento
  */
public class BlindajeTanque extends Blindaje {
    
    public BlindajeTanque() {
        super.nombre ="Blindaje de Tanque";
        super.ataque = 0;
        super.costo = 300;
        super.defensa = 3;
        super.velocidad = 0;
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