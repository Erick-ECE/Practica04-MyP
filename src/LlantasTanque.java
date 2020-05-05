public class LlantasTanque extends Llantas {
    
    public LlantasTanque() {
        super.nombre ="Llantas de Tanque";
        super.ataque = 4;
        super.costo = 300;
        super.defensa = 4;
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