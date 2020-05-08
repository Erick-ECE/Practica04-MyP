/**Clase concreta que especifica el tipo de elemento Carroceria
 * dando valores especificas a las cualidades del elemento
  */
public class CarroceriaCasual extends Carroceria{

    public CarroceriaCasual() {
        super.nombre ="Carroceria Casual";
        super.ataque = 1;
        super.costo = 100;
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