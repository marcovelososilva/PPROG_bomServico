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
        SocioAdulto SA4 = new SocioAdulto("FFF", 666666666, 1986, 0, false);
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
        System.out.println("    SociosAdulto4: " + validarSA5 + ".\ndados:" + SA4.toString());
 
        
    }
    
}
