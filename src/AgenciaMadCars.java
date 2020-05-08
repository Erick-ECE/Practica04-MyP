import java.util.Scanner;

public class AgenciaMadCars {

    public static void main(String[] args) {
        AbstractBuilder builder;
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
    //TODO :
    /** 
     * 
     */
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
                    case 1:builder = new StockBuilder2();
                    break;
                    case 1:builder = new StockBuilder3();
                    break;
                }
            break;
        }
    }

    
}