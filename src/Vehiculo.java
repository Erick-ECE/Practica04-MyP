public class Vehiculo {
    private Carroceria carroceria;  // ("casual", "camion", "deportiva" )
    private Motor motor;       // ("deportivo", "diesel", "simple" )
    private Llantas llantas;     // ("simple", "deportivas", "off-road", "oruga de tanque")
    private Blindaje blindaje;    // ("simple", "reforzado", "tanque")
    private Armas armas;       // ("arpones", "lanzallamas", "lanzas", "sierra", "metralleta")


    public void setCarroceria(Carroceria carroceria) { // se pasa un tipo concreto de carroceria
        this.carroceria = carroceria;
    }

    public void setMotor(Motor motor) { // se pasa un tipo concreto de motor
        this.motor = motor;
    }


    public void setLlantas(Llantas llantas) { // se pasa un tipo concreto de llantas
        this.llantas = llantas;
    }

   
    public void setBlindaje(Blindaje blindaje) { // se pasa un tipo concreto de blindaje
        this.blindaje = blindaje;
    }


    public void setArmas(Armas armas) { // se pasa un tipo concreto de armas
        this.armas = armas;
    }
    
    public Carroceria getCarroceria() { // se regresa un tipo concreto de carroceria
        return carroceria;
    }

    public Motor getMotor() { // se regresa un tipo concreto de motor
        return motor;
    }


    public Llantas getLlantas() { // se regresa un tipo concreto de llantas
        return llantas;
    }

   
    public Blindaje getBlindaje() { // se regresa un tipo concreto de blindaje
        return blindaje;
    }


    public Armas getArmas() { // se regresa un tipo concreto de armas
        return armas;
    }
    
}