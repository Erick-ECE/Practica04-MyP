import java.util.Scanner;
//clase para el main, la agencia de autos
public class AgenciaMadCars {

    public static void main(String[] args) {
        AbstractBuilder builder = null;
        Vehiculo vehiculo;
        Scanner s = new Scanner(System.in);
        int opcion;
        int presupuesto;
        char v = 92;
        System.out.println("\n"+
                            "        |  "+v+"/  | / _ "+v+"|  _  "+v+"      \n"+
                            "        | .  . |/ /_"+v+" "+v+" | | |      \n"+
                            "        | |"+v+"/| ||  _  | | | |      \n"+
                            "        | |  | || | | | |/ /       \n"+
                            "        "+v+"_|  |_/"+v+"_| |_/___/        \n"+
                            "                                   \n"+
                            "                                   \n"+
                            "       _____   ___  ______  _____  \n"+
                            "      /  __ "+v+" / _ "+v+" | ___ "+v+"/  ___| \n"+
                            "      | /  "+v+"// /_"+v+" "+v+"| |_/ /"+v+" `--.  \n"+
                            "      | |    |  _  ||    /  `--. "+v+" \n"+
                            "      | "+v+"__/"+v+"| | | || |"+v+" "+v+" /"+v+"__/ / \n"+
                            "       "+v+"____/"+v+"_| |_/"+v+"_| "+v+"_|"+v+"____/  \n"+
                            "                                   \n"+
                            "        ");
    
    System.out.println("Bienvenido!, Ingresa tu presupuesto(numero entero):");
    presupuesto = s.nextInt();
    
    //Selecciona si hará un carro personalizado o una opción de stock
    System.out.println( " \n"+ "¿Que deseas hacer? :\n "+
                        "      1.- carro personalizado \n" + 
                        "      2.- opción de stock \n");
    opcion = s.nextInt();
    switch(opcion){
            case 1:builder = new PersonalizedBuilder();
            break;
            case 2:
                System.out.println( " \n"+ "Escoja una opción :\n "+
                        "      1.- Stock 1 \n" + 
                        "      2.- Stock 2\n" +
                        "      3.- Stock 3\n");
                opcion = s.nextInt();
                switch(opcion){
                    case 1:builder = new StockBuilder1();
                    break;
                    case 2:builder = new StockBuilder2();
                    break;
                    case 3:builder = new StockBuilder3();
                    break;
                }
            break;
            default: 
                System.out.println( " \n"+ "opcion erronea, escogiendo personalizado por default\n ");
                builder = new PersonalizedBuilder();
            break;
    }
    s.close();

    //Construlle el auto
    builder.addMotor();
    builder.addLlantas();
    builder.addBlindaje();
    builder.addArmas();
    builder.tipoCarroceria();
    vehiculo = builder.getCar();

    //Obtiene los totales de las partes
    //falta calcular los totales de las partes
    String descripcionTotal = vehiculo.getCarroceria().getNombre() + ", "
                            + vehiculo.getMotor().getNombre() + ", "
                            + vehiculo.getLlantas().getNombre() + ", "
                            + vehiculo.getBlindaje().getNombre() + ", "
                            + vehiculo.getArmas().getNombre();
    int costoTotal = vehiculo.getCarroceria().getCosto()
                    + vehiculo.getMotor().getCosto() 
                    + vehiculo.getLlantas().getCosto() 
                    + vehiculo.getBlindaje().getCosto()
                    + vehiculo.getArmas().getCosto();
    int ataqueTotal= vehiculo.getCarroceria().getAtaque() 
                    + vehiculo.getMotor().getAtaque()
                    + vehiculo.getLlantas().getAtaque()
                    + vehiculo.getBlindaje().getAtaque()
                    + vehiculo.getArmas().getAtaque();
    int defensaTotal= vehiculo.getCarroceria().getDefensa() 
                    + vehiculo.getMotor().getDefensa()
                    + vehiculo.getLlantas().getDefensa() 
                    + vehiculo.getBlindaje().getDefensa()
                    + vehiculo.getArmas().getDefensa();
    int velocidadTotal= vehiculo.getCarroceria().getVelocidad() 
                      + vehiculo.getMotor().getVelocidad() 
                      + vehiculo.getLlantas().getVelocidad() 
                      + vehiculo.getBlindaje().getVelocidad()
                      + vehiculo.getArmas().getVelocidad();


    //Revisa que se mantenga en presupuesto
    if (costoTotal> presupuesto){
        System.out.println( "Su presupuesto es muy bajo, regrese cuando ahorre más :'(\n ");
    }else{
        //imprime datos del vehiculo generado
        System.out.println( "Este es su auto:\n ");
        System.out.println( "Componentes: "+ descripcionTotal+"\n ");
        System.out.println( "Costo: "+ costoTotal+"\n ");
        System.out.println( "Ataque: "+ ataqueTotal+"\n ");
        System.out.println( "Defensa: "+ defensaTotal+"\n ");
        System.out.println( "Velocidad: "+ velocidadTotal+"\n ");
    }
    //falta revisar si se pasó del presupuesto
    }

    
}