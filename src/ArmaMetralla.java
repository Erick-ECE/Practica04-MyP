public class ArmaMetralla extends Armas{
    
    public ArmaMetralla() {
        super.nombre ="Metralla";
        super.ataque = 4;
        super.costo = 500;
        super.defensa = 2;
        super.velocidad = 23;
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