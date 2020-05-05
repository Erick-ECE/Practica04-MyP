public class CarroceriaCamion extends Carroceria{

    public CarroceriaCamion() {
        super.nombre ="Carroceria Camion";
        super.ataque = 3;
        super.costo = 200;
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