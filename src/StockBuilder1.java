public class StockBuilder1 implements AbstractBuilder { //clase para un Stock2
    public StockBuilder1(){super.vehiculo = new Vehiculo();}

    public void tipoCarroceria(){ // se pasa un tipo concreto de carroceria CarroceriaCamion
        Carroceria carroceria=  new CarroceriaCamion();
        super.vehiculo.setCarroceria(carroceria);
    }

    public void addMotor(){ // se pasa un tipo concreto de motor MotorDiesel
        Motor motor = new MotorDiesel();
        super.vehiculo.setMotor(motor);
    }

    public void addLlantas(){ // se pasa un tipo concreto de llantas LlantasOffRoad
        Llantas llantas = new LlantasOffRoad();
        super.vehiculo.setLlantas(llantas);
    }

    public void addBlindaje(){ // se pasa un tipo concreto de blindaje BlindajeSimple
        Blindaje blindaje = new BlindajeSimple();
        super.vehiculo.setBlindaje(blindaje);
    }

    public void addArmas(){ // se pasa un tipo concreto de armas ArmaLanza
        Armas armas = new ArmaLanza();
        super.vehiculo.setArmas(armas);
    }
}
