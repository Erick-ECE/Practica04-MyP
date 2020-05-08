/**Clase concreta que especifica el tipo de elemento Arma
 * dando valores especificas a las cualidades del elemento
  */
public class ArmaArpon extends Armas{
    
    public ArmaArpon() {
        super.nombre ="Arpon";
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