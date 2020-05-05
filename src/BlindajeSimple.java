public class BlindajeSimple extends Blindaje {

    public BlindajeSimple() {
        super.nombre ="Blindaje Simple";
        super.ataque = 0;
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