public class StockBuilder2 implements AbstractBuilder { //clase para un Stock deportivo
    public StockBuilder2(){super.vehiculo = new Vehiculo();}

    public void tipoCarroceria(){
        Carroceria carroceria= new CarroceriaDeportiva();
        super.vehiculo.setCarroceria(carroceria);
    }

    public void addMotor(){
        Motor motor = new MotorSimple();
        super.vehiculo.setMotor(motor);
    }

    public void addLlantas(){
        Llantas llantas = new LlantasSiples();
        super.vehiculo.setLlantas(llantas);
    }

    public void addBlindaje(){
        Blindaje blindaje = new BlindajeTanque();
        super.vehiculo.setBlindaje(blindaje);
    }

    public void addArmas(){
        Armas armas = new ArmaLanzallamas();
        super.vehiculo.setArmas(armas);
    }
}
