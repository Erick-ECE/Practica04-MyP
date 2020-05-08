/**Clase concreta que especifica el tipo de elemento Arma
 * dando valores especificas a las cualidades del elemento
  */
public class ArmaLanza extends Armas {
    
    public ArmaLanza() {
        super.nombre ="Lanzas";
        super.ataque = 1;
        super.costo = 120;
        super.defensa = 2;
        super.velocidad = 4;
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