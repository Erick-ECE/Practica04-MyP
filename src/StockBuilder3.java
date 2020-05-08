public class StockBuilder3 implements AbstractBuilder {  //clase para un Stock casual
    public StockBuilder3(){super.vehiculo = new Vehiculo();}

    public void tipoCarroceria(){ // se pasa un tipo concreto de carroceria casual
        Carroceria carroceria= new CarroceriaCasual();
        super.vehiculo.setCarroceria(carroceria);
    }

    public void addMotor(){ // se pasa un tipo concreto de motor casual
        Motor motor = new MotorDeportivo();
        super.vehiculo.setMotor(motor);
    }

    public void addLlantas(){ // se pasa un tipo concreto de llantas
        Llantas llantas = new LlantasDeportivas();
        super.vehiculo.setLlantas(llantas);
    }

    public void addBlindaje(){ // se pasa un tipo concreto de llantas
        Blindaje blindaje = new BlindajeReforzado();
        super.vehiculo.setBlindaje(blindaje);
    }

    public void addArmas(){ // se pasa un tipo concreto de llantas
        Armas armas = new ArmaArpon();
        super.vehiculo.setArmas(armas);
    }
}
