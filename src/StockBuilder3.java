public class StockBuilder3 implements AbstractBuilder {  //clase para un Stock1
    public StockBuilder3(){super.vehiculo = new Vehiculo();}

    public void tipoCarroceria(){ // se pasa un tipo concreto de carroceria CarroceriaCasual
        Carroceria carroceria= new CarroceriaCasual();
        super.vehiculo.setCarroceria(carroceria);
    }

    public void addMotor(){ // se pasa un tipo concreto de motor MotorDeportivo
        Motor motor = new MotorDeportivo();
        super.vehiculo.setMotor(motor);
    }

    public void addLlantas(){ // se pasa un tipo concreto de llantas LlantasDeportivas
        Llantas llantas = new LlantasDeportivas();
        super.vehiculo.setLlantas(llantas);
    }

    public void addBlindaje(){ // se pasa un tipo concreto de blindaje BlindajeReforzado
        Blindaje blindaje = new BlindajeReforzado();
        super.vehiculo.setBlindaje(blindaje);
    }

    public void addArmas(){ // se pasa un tipo concreto de armas ArmaArpon
        Armas armas = new ArmaArpon();
        super.vehiculo.setArmas(armas);
    }
}
