/**Clase concreta que especifica el tipo de elemento llanta
 * dando valores especificas a las cualidades del elemento
  */
public class LlantasSiples extends Llantas {

    public LlantasSiples() {
        super.nombre ="Llantas Simples";
        super.ataque = 1;
        super.costo = 100;
        super.defensa = 1;
        super.velocidad = 3;
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