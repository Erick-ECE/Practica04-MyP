/**Clase concreta que especifica el tipo de elemento Carroceria
 * dando valores especificas a las cualidades del elemento
  */
public class CarroceriaDeportiva extends Carroceria {

    public CarroceriaDeportiva() {
        super.nombre ="Carroceria Deportiva";
        super.ataque = 2;
        super.costo = 190;
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