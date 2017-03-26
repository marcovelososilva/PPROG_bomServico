package TESTES;

import AssociadosClubeNautico.*;

/**
 *
 * @author Marco-1158383 e João-1161313
 */
public class TESTE_nautico {

    public static void main (String[] args){
        System.out.println("==TESTE UNITÁRIOS");
        SocioMenor SM1 = new SocioMenor("AAA", 111111111, 2016, "encarEdu", 1);
        SocioMenor SM2 = new SocioMenor("BBB", 222222222, 2016, "encarEdu", 50);
        SocioMenor SM3 = new SocioMenor("CCC", 333333333, 2016, "encarEdu", 0);
        SocioMenor SM4 = new SocioMenor();
        System.out.println("\n\nSOCIOS MENORES:");
        boolean validarSM1 = SM1.calcularMensalidade() == 20.0;
        System.out.println("    SociosMenor1: " + validarSM1 + ".\ndados:" + SM1.toString());
        boolean validarSM2 = SM2.calcularMensalidade() == 80.0;
        System.out.println("    SociosMenor2: " + validarSM2 + ".\ndados:" + SM2.toString());
        boolean validarSM3 = SM3.calcularMensalidade() == 0.0;
        System.out.println("    SociosMenor3: " + validarSM3 + ".\ndados:" + SM3.toString());
        boolean validarSM4 = SM4.calcularMensalidade() == 0.0;
        System.out.println("    SociosMenor4: " + validarSM4 + ".\ndados:" + SM4.toString());
        
        SocioAdulto SA1 = new SocioAdulto("DDD", 444444444, 1986, 1, false);
        SocioAdulto SA2 = new SocioAdulto("EEE", 555555555, 1986, 50, true);
        SocioAdulto SA3 = new SocioAdulto("FFF", 666666666, 1986, 50, false);
        SocioAdulto SA4 = new SocioAdulto("FFF", 777777777, 1986, 0, false);
        SocioAdulto SA5 = new SocioAdulto();
        System.out.println("\n\nSOCIOS ADULTOS:");
        boolean validarSA1 = SA1.calcularMensalidade() == 25.0;
        System.out.println("    SociosAdulto1: " + validarSA1 + ".\ndados:" + SA1.toString());
        boolean validarSA2 = SA2.calcularMensalidade() == 0.0;
        System.out.println("    SociosAdulto2: " + validarSA2 + ".\ndados:" + SA2.toString());
        boolean validarSA3 = SA3.calcularMensalidade() == 100.0;
        System.out.println("    SociosAdulto3: " + validarSA3 + ".\ndados:" + SA3.toString());
        boolean validarSA4 = SA4.calcularMensalidade() == 0.0;
        System.out.println("    SociosAdulto4: " + validarSA4 + ".\ndados:" + SA4.toString());
        boolean validarSA5 = SA5.calcularMensalidade() == 0.0;
        System.out.println("    SociosAdulto5: " + validarSA5 + ".\ndados:" + SA5.toString());
 
        SocioSenior SS1 = new SocioSenior("GGG", 888888888, 1946, false);
        SocioSenior SS2 = new SocioSenior("HHH", 999999999, 1937, true);
        SocioSenior SS3 = new SocioSenior();
        System.out.println("\n\nSOCIOS ADULTOS:");
        boolean validarSS1 = SS1.calcularMensalidade() == 44.999998435378075;
        System.out.println("    SociosAdulto1: " + validarSS1 + ".\ndados:" + SS1.toString());
        boolean validarSS2 = SS2.calcularMensalidade() == 0.0;
        System.out.println("    SociosAdulto2: " + validarSS2 + ".\ndados:" + SS2.toString());
        boolean validarSS3 = SS3.calcularMensalidade() == 0.0;
        System.out.println("    SociosAdulto5: " + validarSS3 + ".\ndados:" + SS3.toString());
        
        
        SocioMenor[] listaTesteSocioMenor = new SocioMenor[20];
        listaTesteSocioMenor[0]= SM1;
        listaTesteSocioMenor[1]= SM2;
        listaTesteSocioMenor[2]= SM3;
        listaTesteSocioMenor[3]= SM4;
        listaTesteSocioMenor[4]= new SocioMenor("AAA", 120, 2000, "joana", 1);
        listaTesteSocioMenor[5]= new SocioMenor("AAA", 120, 2000, "joana", 1);
        listaTesteSocioMenor[6]= new SocioMenor("AAA", 120, 2000, "joana", 1);
        listaTesteSocioMenor[7]= new SocioMenor("AAA", 120, 2000, "maria", 1);
        listaTesteSocioMenor[8]= new SocioMenor("AAA", 120, 2000, "maria", 1);
        listaTesteSocioMenor[9]= new SocioMenor("AAA", 120, 2000, "joana", 1);
        listaTesteSocioMenor[10]= new SocioMenor("AAA", 120, 2000, "joana", 1);
        listaTesteSocioMenor[11]= new SocioMenor("AAA", 120, 2000, "joana", 1);
        listaTesteSocioMenor[12]= new SocioMenor("AAA", 120, 2000, "maria", 1);
        listaTesteSocioMenor[13]= new SocioMenor("AAA", 120, 2000, "joana", 1);
        listaTesteSocioMenor[14]= new SocioMenor("AAA", 120, 2000, "joana", 1);
        listaTesteSocioMenor[15]= new SocioMenor("AAA", 120, 2000, "maria", 1);
        listaTesteSocioMenor[16]= new SocioMenor("AAA", 120, 2000, "joana", 1);
        listaTesteSocioMenor[17]= new SocioMenor("AAA", 120, 2000, "joana", 1);
        listaTesteSocioMenor[18]= new SocioMenor("AAA", 120, 2000, "kika", 1);
        listaTesteSocioMenor[19]= new SocioMenor("AAA", 120, 2000, "maria", 1);
        
        System.out.println("\n\nENCARREGADOS DE EDUCAÇÃO:");
        System.out.println("RESULTADO ESPERADO: \n joana = 10 || maria = 5 ||encarEdu = 3 ||  kika=1 || semConstrutor = 1");
        Main.listaEncEducacao(listaTesteSocioMenor);
        
    
    }
    
}
