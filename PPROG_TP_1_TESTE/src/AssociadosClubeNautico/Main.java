/*
 * ASSOCIADOS CLUBE NAUTICO, DISCIPLINA PPROG ANO 2017.
 * 
 */
package AssociadosClubeNautico;

/**
 *
 * @author Marco-115883 | Joao-1161313 (1NB)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        SocioAdulto SA1 =new SocioAdulto("Marco Silva", 236354490, 1986, 5, false);
        SocioMenor SM1 =new SocioMenor("Micaela Dias", 311346797, 1999, "Miguel Dias", 2);
        SocioSenior SS1 =new SocioSenior("dir",123456,1976,true);
        SocioAdulto SA2 =new SocioAdulto("Luís Ferreira", 112211512, 1970, 25, false);
        SocioMenor SM2 =new SocioMenor("André Almeida", 154545789, 2016, "Conceição Alemida", 10);
        SocioSenior SS2 =new SocioSenior("Joao Luis",123456887,1946,false);
        SocioAdulto SA3 =new SocioAdulto("Francisco Moreira", 121518194, 1965, 50, true);
        SocioMenor SM3 =new SocioMenor("Nelson Semedo", 154546458, 2005, "José Semedo", 1);
        SocioSenior SS3 =new SocioSenior("Joao Francisco",123456887,1933,false);
        SocioAdulto SA4 =new SocioAdulto("Gabriel Castanheira", 151616184, 1990, 5, true);
        SocioMenor SM4 =new SocioMenor("Mauro Dias", 121216145, 2000, "Miguel Dias", 50);
        SocioSenior SS4 =new SocioSenior("Bruna Salvada",189223009,1900,false);
        
        Associados[] listaSocios = new Associados[12];
        listaSocios[0]=SA1;
        listaSocios[1]=SM1;
        listaSocios[2]=SS1;
        listaSocios[3]=SA2;
        listaSocios[4]=SM2;
        listaSocios[5]=SS2;
        listaSocios[6]=SA3;
        listaSocios[7]=SM3;
        listaSocios[8]=SS3;
        listaSocios[9]=SA4;
        listaSocios[10]=SM4;
        listaSocios[11]=SS4;
        
        calcularMensalidade(listaSocios);
        listaEncEducacao(listaSocios);
    }
    
    public static void calcularMensalidade(Associados[] listaSocios){
        System.out.println("==CALCULO DAS MENSALIDADES==");
        double mensalidadeTotalJovens = 0;
        double mensalidadeTotalSeniores = 0;
        for (Associados e : listaSocios) {
            if (e !=null){
            double mensalidade = e.calcularMensalidade();
            System.out.println("A mensalidade do sócio " +  e.getNome() + " é de : " + mensalidade + "€.");
            if (e instanceof SocioSenior) {
                mensalidadeTotalSeniores = mensalidadeTotalSeniores+ mensalidade;
            } 
            else{
                mensalidadeTotalJovens = mensalidadeTotalJovens +  mensalidade;
            }
            }
        }
        
        System.out.println("\nO total da mensalidade paga pelos Socios Jovens foi de: " + mensalidadeTotalJovens + "€."
                      + ".\nO total da mensalidade paga pelos Socios Séniores foi de: " +  mensalidadeTotalSeniores + "€."
                      + ".\nO peso da mensalidade dos socios Jovens foi " + (float) ( (mensalidadeTotalJovens) / (mensalidadeTotalJovens+mensalidadeTotalSeniores) * 100) + "%."
                      + ".\nO peso da mensalidade dos socios Seniores foi " + (float) ( (mensalidadeTotalSeniores) / (mensalidadeTotalJovens+mensalidadeTotalSeniores) * 100) + "%." );        
    }
    
    public static void listaEncEducacao(Associados[] listaSocios) {
        System.out.println("\n\n==LISTA ENCARREGADOS DE EDUCAÇÃO E Nº DE EDUCANDOS==");
        String[] listaEncarregados = new String[listaSocios.length];
        int[] numEducandos = new int[listaSocios.length];
        int contEncarregados = 0;
        
        for (int j = 0; j < listaSocios.length; j++ ) {

            if (listaSocios[j] != null && listaSocios[j] instanceof SocioMenor) {
                String nowEncarregado = ((SocioMenor) listaSocios[j]).getEncarregadoEducacao();
                if (nowEncarregado.equalsIgnoreCase("default Encarregados Educação")) {
                    nowEncarregado = "SOCIO(S) CRIADO(S) SEM CAMPO DE ENCARREGADO DE EDUCAÇÃO";
                }
                int tempcontEncarregados = (contEncarregados== 0) ? (contEncarregados+1) : contEncarregados;                
                for (int i = 0; i < tempcontEncarregados; i++) {
                    if (nowEncarregado.equalsIgnoreCase(listaEncarregados[i]) && listaEncarregados[i]!=null) {
                        numEducandos[i]++;
                        break;
                    } else {
                        listaEncarregados[contEncarregados] = nowEncarregado;
                        numEducandos[contEncarregados] = 1;
                        contEncarregados++;
                        break;
                    }
                }            
            }
            
        }
        for (int i = 0; i < listaEncarregados.length; i++) {
           if (listaEncarregados[i] != null){
            System.out.println("O encarregado de Educação: " + listaEncarregados[i] + " tem " + numEducandos[i] + " educandos." );
            }
        }
    }

}
