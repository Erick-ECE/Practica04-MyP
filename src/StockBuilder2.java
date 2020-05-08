public class StockBuilder2 extends AbstractBuilder { //clase para un Stock 3
    public StockBuilder2(){super.vehiculo = new Vehiculo();}

    public void tipoCarroceria(){ // se pasa un tipo concreto de carroceria CarroceriaDeportiva
        Carroceria carroceria= new CarroceriaDeportiva();
        super.vehiculo.setCarroceria(carroceria);
    }

    public void addMotor(){// se pasa un tipo concreto de motor MotorSimple
        Motor motor = new MotorSimple();
        super.vehiculo.setMotor(motor);
    }

    public void addLlantas(){// se pasa un tipo concreto de llantas LlantasSiples
        Llantas llantas = new LlantasSiples();
        super.vehiculo.setLlantas(llantas);
    }

    public void addBlindaje(){// se pasa un tipo concreto de blindaje BlindajeTanque
        Blindaje blindaje = new BlindajeTanque();
        super.vehiculo.setBlindaje(blindaje);
    }

    public void addArmas(){// se pasa un tipo concreto de armas ArmaLanzallamas
        Armas armas = new ArmaLanzallamas();
        super.vehiculo.setArmas(armas);
    }
}
