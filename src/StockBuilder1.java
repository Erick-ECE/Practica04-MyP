public class StockBuilder1 implements AbstractBuilder { //clase para un Stock camion
    public StockBuilder1(){super.vehiculo = new Vehiculo();}

    public void tipoCarroceria(){
        Carroceria carroceria=  new CarroceriaCamion();
        super.vehiculo.setCarroceria(carroceria);
    }

    public void addMotor(){
        Motor motor = new MotorDiesel();
        super.vehiculo.setMotor(motor);
    }

    public void addLlantas(){
        Llantas llantas = new LlantasOffRoad();
        super.vehiculo.setLlantas(llantas);
    }

    public void addBlindaje(){
        Blindaje blindaje = new BlindajeSimple();
        super.vehiculo.setBlindaje(blindaje);
    }

    public void addArmas(){
        Armas armas = new ArmaLanza();
        super.vehiculo.setArmas(armas);
    }
}
